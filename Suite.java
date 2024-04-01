package HP;

public class Suite extends Room 
{
	//Declared variables:
	private int snumberofRooms;
	
	//the constructor
	public Suite(String roomNumber, int snumberofRooms)
	{
		super (roomNumber);
		
		//since the rooms can't have more than  6 beds we have to use exception handling
		if (snumberofRooms > 7)
			throw new IllegalArgumentException
			("Number of Rooms cannot be graeter than 6");
		this.snumberofRooms=snumberofRooms;
	}
	
	
	//The setter and getter methods:
	public void setnumberofRoomss(int x)
	{
		this.snumberofRooms=x;
	}
			
	public int getNumofRooms()
	{
		return snumberofRooms;
	}
			
			
	//the implementation of the abstract method service:
	@Override
	public String services()
	{
		return "The service for the suite includes free wifi, braekfast and lunch, along with a freepass for the gym and the pool";
	}
			
			
    //Over-riding the toString() function:
	@Override
	public String toString()
	{
		return String.format("%s: %s %nThe room type is: Suite %n%s: %d %n%s: %s %n%n",
						 "The room number", getRoomNum(), "The number of rooms", snumberofRooms,"The rooms services", services());
	}

}
