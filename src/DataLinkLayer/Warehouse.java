package DataLinkLayer;

public class Warehouse {
	private int id;
	private String name;
	private String description;
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
	public Warehouse(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Warehouse(int id) {
		//get
	}
	
	
}
