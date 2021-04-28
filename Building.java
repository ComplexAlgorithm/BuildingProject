
public class Building {
	//instance variables
	private String name;
	private int numberOfRooms;
	
	//default constructor
	public Building() {
		name = "";
		numberOfRooms = 1;
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNumberOfRooms(int newNumberOfRooms) {
		if(newNumberOfRooms > 0) {
			numberOfRooms = newNumberOfRooms;
		}
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
}