package HP;

import java.util.Scanner;

public class Hotel
{
	
	//Declared variables
	
	private final String Name= "Intercontinental";
	private final String Address= "TAIF";
	Booking booking;
	Customer customer;
	Room room;
	
	// declared composition relationship:
	
	//The rooms in the hotel:
	   Room suite1= new Suite("101", 4);
	   Room suite2= new Suite("102", 5);
	   Room suite3= new Suite("103", 6);
	   
	   Room individual1= new Individual("104", 1);
	   Room individual2= new Individual("105", 1);
	   Room individual3= new Individual("106", 2);
	   
	   Room family1= new Family("107", 2);
	   Room family2= new Family("108", 3);
	   Room family3= new Family("109", 3);

	
	// The staff members in the Hotel:
	   Staff cleaner1= new Staff("Othman", "Ahmed", "221", "Cleaner", 2000);
	   Staff cleaner2= new Staff("Ali", "Fahad", "222", "Cleaner", 2000);
	   Staff chef1= new Staff("Chang", "Lee", "121", "Chef", 15000);
	   Staff receptionist1= new Staff("Noura", "Khaled", "321", "Receptionist", 3000);
	   Staff receptionist2= new Staff("Waleed", "Omar", "322", "Receptionist", 3000);
	   Staff security1= new Staff("Ameen", "Nour", "421", "Security", 2500);
	   
	   
	 //No arguments constructor
	   public Hotel()
	   {
		   
	   };
	
	
	
	//These are the get classes of variables
	
	 public String getName()
	 {
		 return Name;
	 }
	 
	 public String getAddress()
	 {
		 return Address;
	 }
	 
	 
	//These are the get classes of composition relationship
	 
	 public String getbooking()
	 {
		 return booking.toString();
	 }
	 
	 public String getcustomer()
	 {
		 return customer.toString();
	 }
	 
	 public String getroom()
	 {
		return room.toString();
	 }
	 
	 
	 //This is a method the user can use to choose the type of customer and enter their info
	 
	 public Customer cInfo()
		{
			
			 Scanner cType= new Scanner(System.in);
			 System.out.printf("%s %n%s %n%s %n","choose type of customer:", "1) regular", "2)VIP:");
			   int type= cType.nextInt();
			   switch(type)
			   {
			   case 1:
			   default:
			Scanner customer= new Scanner(System.in);
					
			System.out.println("Enter the customer ID:");
			String cID= customer.next();
					
			System.out.println("Enter the customer first name:");
			String cFName= customer.next();
					
			System.out.println("Enter the customer last name:");
			String cLName= customer.next();
					
			System.out.println("Enter the customer gender (M/F):");
			char cGender= customer.next().charAt(0);
					
			Customer c= new Customer(cID, cFName, cLName, cGender);
			return c;

			   case 2:
	        Scanner custvip= new Scanner(System.in);
			
			System.out.println("Enter the customer ID:");
			String cvID= custvip.next();
			
			System.out.println("Enter the customer first name:");
			String cvFName= custvip.next();
			
			System.out.println("Enter the customer last name:");
			String cvLName= custvip.next();
			
			System.out.println("Enter the customer gender (M/F):");
			char cvGender= custvip.next().charAt(0);
			
			System.out.println("Enter the customer rank:");
			int cRank= custvip.nextInt();
			
			Customer cvip= new CVIP(cvID, cvFName, cvLName, cvGender, cRank);
			return cvip;
			
			   }
		}
	 
	 
	 
	   //A method to enable user to choose a room:
	 
	   public Room chooseRoom()
	   {
		   System.out.printf("%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n","Choose a room from the menu:"
		   		,"1) Suite number 101 with 4 rooms", "2) Suite number 102 with 5 rooms"
		   		, "3) Suite number 103 with 6 rooms", "4) Singles room number 104 with 1 bed"
		   		,"5) Singles room number 105 with 1 bed", "6) Singles room number 106 with 2 beds"
		   		,"7) Family room number 107 with 2 rooms", "8) Family room number 108 with 3 rooms"
		   		,"9) Family room number 109 with 3 rooms:");
		   
		   Scanner roomCh= new Scanner(System.in);
		   int choice= roomCh.nextInt();
		   int x=choice;
		   switch(x)
		   {
		   case 1:
			   room= suite1;
			   return suite1;
			   
		   case 2:
			   room= suite2;
			   return suite2;
		   case 3:
			   room= suite3;
			   return suite3;
		   case 4:
			   room= individual1;
			   return individual1;
		   case 5:
			   room= individual2;
			   return individual2;
		   case 6:
			   room= individual3;
			   return individual3;
		   case 7:
			   room= family1;
			   return family1;
		   case 8:
			   room= family2;
			   return family2;
		   case 9:
			   room= family3;
			   return family3;
		   default:
		   System.out.println("The default option is room number 104 ");
		   room= individual1;
		   return individual1;
			   
		   }
	   }
	 
	 
	   //The method to print information of all staff members in the hotel
	   public void allStaff()
	   {
		   System.out.println(cleaner1.toString());
		   System.out.println(cleaner2.toString());
		   System.out.println(chef1.toString());
		   System.out.println(receptionist1.toString());
		   System.out.println(receptionist2.toString());
		   System.out.println(security1.toString());
	   }
	 
	  //Overriding the toString function as a class function
	 
	  @Override
	  public String toString()
	  {
		 return String.format("%s %s  %n%s %s %n%n",
				 Name,"Hotel", Address,"Branch");
	  }
}
