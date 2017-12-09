package DataLinkLayer;

import java.time.*;
import java.util.*;

public class Transaction {
	private int id;
	private LocalDateTime dateTime;
	private Customer customer;
	private double totalPrice;
	private Payment payment;
	private Cashier cashier;
	private Station station;
	private List<Item> items = new ArrayList<Item>();
	
	public int getId() {
		return id;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public Payment getPayment() {
		return payment;
	}
	public Cashier getCashier() {
		return cashier;
	}
	public Station getStation() {
		return station;
	}
	public List<Item> getItems() {
		return items;
	}
	public Transaction(LocalDateTime dateTime, Customer customer, double totalPrice, Payment payment, Cashier cashier,
			Station station) {
		super();
		this.dateTime = dateTime;
		this.customer = customer;
		this.totalPrice = totalPrice;
		this.payment = payment;
		this.cashier = cashier;
		this.station = station;
	}
	public Transaction(int id) {
		super();
		this.id = id;
	}
	
	public void addItem(Item i)
	{
		items.add(i);
	}
	
}
