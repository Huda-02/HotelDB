package HP;

public class CVIP extends Customer
{
   //Declared variables:
	
   private int cRank;
   
   //The constructor:
   public CVIP(String Cid,String cFname, String cLname,char gender, int cRank)
      {
	   super(Cid,cFname,cLname, gender);
	
       setRank(cRank);
      }


      //the setters and getters

      public int getcRank()
      {
	     return cRank;
      }

      public void setRank(int cRank)
      {
	    switch(cRank)
	    {
	       case 1:
		     this.cRank=cRank;
		   break;
		   
	       case 2:
		     this.cRank=cRank;
		   break;
		   
	       case 3:
		     this.cRank=cRank;
		   break;
		   
		   default :
		      System.out.println("You must choose from these numbers for the rank: (1,2,3)");	
	   }
     }


    //method for showing rank Privileges
    public String rankPrivilages(int cRank)
    {
	  switch(cRank)
	  {
	    case 1:
		   return "This customer is ranked as VIP & has an Exclusive access and reservations";
		
	    case 2:
		   return "This customer is ranked as a Celebrity & has a welcoming cake and ballones, 20% off the price";
		   
	    case 3:
		   return "This customer is ranked as a Politician & has access to meeting facilities, complimentary coffee and branch services";
		default :
		   return "You must choose from these numbers: (1,2,3)";
	  }
    }
    
    
    //Over-riding the toString() function:
    @Override
    public String toString()
    {
      return String.format("%s %n%s %d %n%s %n",super.toString(),"The rank for this customer is:", cRank, rankPrivilages(cRank));
    }

 }

