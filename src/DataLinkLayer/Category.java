package DataLinkLayer;

public class Category {
	private int id;
	private String Name;
	private String description;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	
	
	
	public Category(String name, String description) {
		super();
		Name = name;
		this.description = description;
	}
	public Category(int id) {
		//get
	}
	
	
	
}
