package HP;

public class Customer 
{
	//Declared variables:
	
	private final String Cid;
	private final String cFname;
	private final String cLname;
	private final char gender;
	
	
	//Constructors:
	
	//the arguments constructor for this class:
	public Customer (String Cid,String cFname, String cLname,char gender)
	{
		this.Cid=Cid;
		this.cFname=cFname;
		this.cLname=cLname;
		this.gender=gender;
	}
	
	
	//the default constructor for this class:
	public Customer ()
	{
		Cid="NULL";
		cFname="NULL";
		cLname="NULL";
		gender=' ';
	}


	//The getters and the setters:
	
    public String getCid()
    {
	  return Cid;
    }

    
    public String getcFname()
    {
	  return cFname;
    }
    
    
    public String getLname()
    {
	  return cLname;
    }

    
    public char getgender()
    {
	  return gender;
    }
    

    //Over-riding the toString() function:
    @Override
    public String toString()
    {
      return String.format("%s: %s %n%s: %s %s %n%s: %c %n","Customer ID",Cid,"Customer Name",
		 cFname,cLname, "Gender",gender);
    }

}
