package DataLinkLayer;

public class ShelfEmployee extends Employee {
	
	private Shelf shelf;
	
	ShelfEmployee(String name, String username, String password) {
		super(name, username, password, 2);
		// TODO Auto-generated constructor stub
	}


	public ShelfEmployee(int ID) {
		super(ID);
		//fill shelf
	}
	
	
	public boolean Save()
	{
		super.Save();
		// save shelf data
		return false;
	}

}
