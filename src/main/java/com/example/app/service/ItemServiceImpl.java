package com.example.app.service;

import java.util.List;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.domain.Item;
import com.example.app.domain.Place;
import com.example.app.mapper.ItemDynamicSqlSupport;
import com.example.app.mapper.ItemMapper;
import com.example.app.mapper.PlaceDynamicSqlSupport;
import com.example.app.mapper.PlaceMapper;

@Service
public class ItemServiceImpl implements ItemService {

	private final ItemDynamicSqlSupport.Item items = ItemDynamicSqlSupport.item;
	private final PlaceDynamicSqlSupport.Place places = PlaceDynamicSqlSupport.place;
	
	private final ItemMapper itemMapper;
	private final PlaceMapper placeMapper;
	
	@Autowired
	public ItemServiceImpl(ItemMapper itemMapper, PlaceMapper placeMapper) {
		this.itemMapper = itemMapper;
		this.placeMapper = placeMapper;
	}
	
	@Override
	public List<Item> getItemsByPage(int page, int numPerPage) {
		int offset = (page - 1) * numPerPage;
		var stmt = SqlBuilder
				.select(items.allColumns(), places.id.as("place_id"), places.name.as("place_name"))
				.from(items)
				.join(places)
				.on(items.placeId, SqlBuilder.equalTo(places.id))
				.orderBy(items.id)
				.limit(numPerPage).offset(offset)
				.build()
				.render(RenderingStrategies.MYBATIS3);
		return itemMapper.selectManyJoinPlace(stmt);
	}

	@Override
	public int countItems() {
		return (int) itemMapper.count(CountDSLCompleter.allRows());
	}

	@Override
	public void addItem(Item item) {
		itemMapper.insert(item);
	}

	@Override
	public void editItem(Item item) {
		itemMapper.updateByPrimaryKey(item);		
	}

	@Override
	public void deleteItemById(int id) {
		itemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Place> getItemPlaces() {
		return placeMapper.select(c -> c.orderBy(places.id));
	}

}
