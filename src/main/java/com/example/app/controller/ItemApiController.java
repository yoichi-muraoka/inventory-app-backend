package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.domain.Item;
import com.example.app.domain.Place;
import com.example.app.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemApiController {
	
	private final ItemService itemService;
	
	@Autowired
	public ItemApiController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping("/items")
	public ResponseEntity<List<Item>> listItem(
			@RequestParam(name = "_page", defaultValue = "1") Integer page,
			@RequestParam(name = "_limit", defaultValue = "5") Integer limit
			) {
		var headers = new HttpHeaders();
		headers.add("X-Total-Count", Integer.valueOf(itemService.countItems()).toString());
		
		List<Item> itemList = itemService.getItemsByPage(page, limit);
		
		return ResponseEntity.ok().headers(headers).body(itemList);
	}
	
	@GetMapping("/places")
	public ResponseEntity<List<Place>> listPlace() {
		List<Place> placeList = itemService.getItemPlaces();
		return ResponseEntity.ok().body(placeList);
	}
	
	@PostMapping("/items")
	public ResponseEntity<String> addItem(@RequestBody Item item) {
		int placeId = item.getPlace().getId();
		item.setPlaceId(placeId);
		itemService.addItem(item);
		return ResponseEntity.ok().body("added an item successfully");
	}
	
	@PutMapping("/items/{id}")
	public ResponseEntity<String> editItem(
			@PathVariable Integer id,
			@RequestBody Item item
			) {
		if(!item.getId().equals(id)) {
			return ResponseEntity.badRequest().body("something wrong with id");
		}
		
		int placeId = item.getPlace().getId();
		item.setPlaceId(placeId);
		itemService.editItem(item);
		return ResponseEntity.ok().body("edited an item successfully");
	}
	
	@DeleteMapping("/items/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Integer id) {
		itemService.deleteItemById(id);
		return ResponseEntity.ok().body("deleted an item successfully");
	}

}






