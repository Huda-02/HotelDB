package HP;

public class Family extends Room 
{
	//Declared variables:
	private int fnumberofRooms;
	
	//constructor 
	public Family(String roomNumber, int fnumberofRooms)
	{
		super(roomNumber);
			
		//since the rooms can't have more than  6 beds we have to use exception handling
		if (fnumberofRooms > 4)
			throw new IllegalArgumentException
			("Number of Rooms cannot be graeter than 3");
		this.fnumberofRooms=fnumberofRooms;
	}
		
		
	//the setter and getter methods:
	public void setnumberofRoomss(int x)
	{
		this.fnumberofRooms=x;
	}
	
	
	public int getNumofRooms()
	{
		return fnumberofRooms;
	}
		
		
	//the implementation of the abstract method service:
	@Override
	public String services()
	{
		return "The service for this room include free wifi and breakfast";
	}

		
	//Over-riding the toString() function as a class function
	 @Override
	public String toString()
	{
			return String.format("%s: %s %n%s: %d %n%s: %s %n%n",
					 "The room number",  getRoomNum(),"The number of rooms", fnumberofRooms, "The rooms services", services());
	}
}
