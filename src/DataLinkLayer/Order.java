package DataLinkLayer;

import java.time.LocalDate;

public class Order {
	private int id;
	private LocalDate date;
	private Item item;
	private int quantity;
	public int getId() {
		return id;
	}
	public LocalDate getDate() {
		return date;
	}
	public Item getItem() {
		return item;
	}
	public int getQuantity() {
		return quantity;
	}
	public Order(LocalDate date, Item item, int quantity) {
		super();
		this.date = date;
		this.item = item;
		this.quantity = quantity;
	}
	public Order(int id) {
		// get order
	}
	
	
	
}
