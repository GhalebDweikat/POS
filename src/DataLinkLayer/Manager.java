package DataLinkLayer;

public class Manager extends Employee {

	public Manager(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	Manager(String name, String username, String password) {
		super(name, username, password, 1);
		// TODO Auto-generated constructor stub
	}
	
	
	public Cashier createCashier(String name, String username, String password) {
		return new Cashier(name, username, password, 3);
	}

}
