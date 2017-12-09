package DataLinkLayer;

public class Station {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Station(String name) {
		super();
		this.name = name;
	}
	public Station(int id) {
		//get
	}
	
	public static Station getStationByName(String name)
	{
		// find station if exists, otherwise return null
		return null;
	}
	
}
