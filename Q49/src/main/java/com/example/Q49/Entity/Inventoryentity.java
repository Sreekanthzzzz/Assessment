package com.example.Q49.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Inventoryentity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String Productname;
	private String Description;
	
	public Inventoryentity(long id, String Productname, String Description) {
		super();
		this.id = id;
		this.Productname = Productname;
		this.Description = Description;
	}
	
	public Inventoryentity() {
		super();
	}
	
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", Productname=" + Productname + ", Description=" + Description + "]";
	}

}
