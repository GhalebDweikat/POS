package DataLinkLayer;

public class Customer {
	private int id;
	private String name;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Customer(int id) {
		//get
	}
	
	
}
