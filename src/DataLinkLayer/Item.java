package DataLinkLayer;

public class Item {
	private int id;
	private String barcode;
	private String name;
	private String description;
	private Supplier supplier;
	private double price;
	
	public Item(String barcode, String name, String description, Supplier supplier, double price) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.description = description;
		this.supplier = supplier;
		this.price = price;
	}
	
	public Item(int id) {
		// get item
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	
	
	
}
