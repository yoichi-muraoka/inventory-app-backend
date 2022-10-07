package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
		List<Item> itemList = itemService.getItemsByPage(page, limit);
		return ResponseEntity.ok().body(itemList);
	}
	
	@GetMapping("/places")
	public ResponseEntity<List<Place>> listPlace() {
		List<Place> placeList = itemService.getItemPlaces();
		return ResponseEntity.ok().body(placeList);
	}

}
