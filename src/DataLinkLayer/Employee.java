package DataLinkLayer;

public class Employee {
	private int id;
	private String name;
	private String username;
	private String password;
	private int type;
	
	
	
	Employee(String name, String username, String password, int type) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.type = type;
		this.id=-1;
	}

	public Employee(int ID)
	{
		//get Employee data from DB
	}	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean Save()
	{
		//save employee to DB
		// if ID == -1 then new employee
		// else update
		return false;
	}
}
