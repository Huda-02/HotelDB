package HP;


public class Booking {
	
	//Declared variables:
	
	private final int BID;
	private String checkIn;
	private String checkOut;
	private Room room;
	private Customer customer;
	
	
	
	
	
	//Constructors:
	
	//the arguments constructor for this class:
	public Booking(int BID, String checkIn, String checkOut, Room room, Customer customer)
	{
		this.BID= BID;
		this.checkIn= checkIn;
		this.checkOut= checkOut;
		this.room= room;
		this.customer=customer;
	}
	
	//the default constructor for this class:
	public Booking()
	{
		this.BID= 0;
		this.checkIn= "NULL";
		this.checkOut= "NULL";
		
	}
	
	
	
	//The setter and getter methods
	
	public int getBID()
	{
		return BID;
	}
	
	
	public void setCheckIn(String d)
	{
		checkIn=d;
	}
	
	
	public void setCheckOut(String d)
	{
		checkOut=d;
	}
	
	
	public String getCheckIn()
	{
		return checkIn;
	}
	
	
	public String getCheckOut()
	{
		return checkOut;
	}
	
	
	
	//Over-riding the toString() function:
	
	@Override
	public String toString()
	{
		return String.format("The ID for the booking is: %d %nThe check in date is: %s %nThe check out date is: %s %n%s"
				+ "%n%s %n%n"
				, BID, checkIn, checkOut, room, customer);
		
	}
		

}
