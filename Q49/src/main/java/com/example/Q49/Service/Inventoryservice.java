package com.example.Q49.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Q49.Entity.Inventoryentity;
import com.example.Q49.Repositpory.Inventoryrepository;
@Service
public class Inventoryservice {

	Inventoryrepository inventoryRepository;
	
	public Inventoryentity saveProduct(Inventoryentity inventory){
		
		return inventoryRepository.save(inventory);
		
	}

	public List<Inventoryentity> getProducts(){
		
		return inventoryRepository.findAll();
	}
	
	public Optional<Inventoryentity> find(long id) {
		
		return inventoryRepository.findById(id);
	}
	
	public void deleteProduct(long id) {
		
		 inventoryRepository.deleteById(id);
	}

}
