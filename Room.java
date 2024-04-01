package HP;

public abstract class Room {
	private String roomNumber;
	
	//Constructors:
	
	//the arguments constructor for this class:
	public Room(String roomNumber)
	{
		this.roomNumber=roomNumber;
	}

	
	
	//the setter and the getter:
	
	public void setrRoomNum(String x)
	{
		roomNumber=x;
	}
	
	public String getRoomNum()
	{
		return roomNumber;
	}
	
	
	//The abstract method:
	public abstract String services();
	
	
	
	//Over-riding the toString() function as a class function
	 @Override
	 public String toString()
	 {
		 return String.format("%s: %s %n%n ",
				 "The room number", roomNumber );
	 }


	
}
