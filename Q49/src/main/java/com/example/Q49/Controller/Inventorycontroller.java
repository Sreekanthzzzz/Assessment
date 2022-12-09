package com.example.Q49.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Q49.Entity.Inventoryentity;
import com.example.Q49.Service.Inventoryservice;


@RestController
@RequestMapping("/inventory")
public class Inventorycontroller {
	
	Inventoryservice inventoryService;
	
	@PostMapping("/add")
	public ResponseEntity<Inventoryentity> saveProduct(@RequestBody Inventoryentity inventory) {
		
		return new ResponseEntity<>(inventoryService.saveProduct(inventory),HttpStatus.CREATED);
	}
	
	@GetMapping("/inventorylist")
	public ResponseEntity<List<Inventoryentity>> getProducts(){
		return new ResponseEntity<>(inventoryService.getProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Inventoryentity> getProduct(@PathVariable long id){
		
		Optional<Inventoryentity> inventory= inventoryService.find(id);
		if(inventory.isPresent()) {
			return new ResponseEntity<>(inventory.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable long id){
		
		Optional<Inventoryentity> inventory= inventoryService.find(id);
		if(inventory.isPresent()) {
			inventoryService.deleteProduct(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
