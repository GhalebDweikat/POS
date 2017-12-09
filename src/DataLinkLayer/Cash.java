package DataLinkLayer;

public class Cash implements Payment {
	private int id;
	private double amount;
	private double change;
	
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public double getChange() {
		return change;
	}
	
	public Cash(double amount, double change) {
		super();
		this.amount = amount;
		this.change = change;
	}
	public Cash(int id) {
		// get
		
	}
	
	
}
