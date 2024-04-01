package HP;

public class Individual extends Room 
{
	//Declared variables:
	
	private int numberofBeds;
	
	
	//constructor 
	public Individual(String roomNumber, int numberofBeds)
	{
		super(roomNumber);
		
		//since a room can't have more than 2 beds we have to use exception handling
		if (numberofBeds > 3)
			throw new IllegalArgumentException
			("Number of beds in one room cannot be graeter than 2");
		this.numberofBeds=numberofBeds;
	}
	
	
	// the setter and getter methods:
	public void setnumberofBeds(int x)
	{
		this.numberofBeds=x;
	}
	
	
	public int getNumofBeds()
	{
		return numberofBeds;
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
		return String.format("%s: %s %n%s: %d %n%s: %s %n%n ",
					 "The room number",  getRoomNum(),"The number of beds", numberofBeds, "The rooms services", services());
	}


}
