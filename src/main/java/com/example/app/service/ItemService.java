package com.example.app.service;

import java.util.List;

import com.example.app.domain.Item;
import com.example.app.domain.Place;

public interface ItemService {
	
	List<Item> getItemsByPage(int page, int numPerPage);
	int countItems();
	void addItem(Item item);
	void editItem(Item item);
	void deleteItemById(int id);
	
	List<Place> getItemPlaces();
}
