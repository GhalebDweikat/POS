package DataLinkLayer;

public class Card implements Payment {
	private int id;
	private String holderName;
	private double change;
	
	public int getId() {
		return id;
	}
	public String getHolderName() {
		return holderName;
	}
	public double getChange() {
		return change;
	}
	
	public Card(String holderName, double change) {
		super();
		this.holderName = holderName;
		this.change = change;
	}
	public Card(int id) {
		//get
	}
	
	
	
}
