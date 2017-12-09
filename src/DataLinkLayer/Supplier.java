package DataLinkLayer;

import java.util.*;

public class Supplier {
	private int id;
	private String name;
	private String address;

	
	
	
	public Supplier(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		
	}
	
	
	public Supplier(int id) {
		//get supplier
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}

	
	
}
