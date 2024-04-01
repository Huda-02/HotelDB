package HP;
import java.util.Scanner;
import java.util.LinkedList;


public class HotelTest {
	
	//The main method:

	public static void main(String[] args)
	{
	  //Declared variables/ objects:
		
	  int x;
	  int bID;
	  String cInDate;
	  String cOutDate;
	  
	  
	  Customer customer= new Customer();
	  Room room;
	  Booking b1= new Booking();
	  Hotel info= new Hotel();
	  
	  //The linked list for storing the reservations
	  LinkedList<Booking> reservations = new LinkedList<Booking>();
	  
	  //A welcome message:
	  System.out.printf("%s %n%s %n", "Welcome to", info.toString());
	  
	  //A loop to allow the user to enter delete and view information:
      do {
			System.out.printf("%s %n%s %n%s %n%s %n%s %n%s %n%s %n","Choose from the menu:"
			   		,"1) Make a new reservation","2) Get all reservatins details"
			   		, "3) Get a customer information", "4) Delete a reservation"
			   		,"5) get information for all staff members", "6) Exit");
			
			//Reading the user choice 
			Scanner choice= new Scanner(System.in);
			System.out.println("Enter your choice 1-6:");
			x= choice.nextInt();
			
		   switch(x)
		   {
		   case 1:
			   
			   //Entering a new reservation details:
			   
		      customer=info.cInfo();
		      room=info.chooseRoom();
	   
		      Scanner booking= new Scanner(System.in);
			  System.out.println("Enter the booking ID:");
			  bID= booking.nextInt();
			
			  System.out.println("Enter the check in date (YYYY-MM-DD):");
			  cInDate= booking.next();
			
			  System.out.println("Enter the check out date (YYYY-MM-DD):");
			  cOutDate= booking.next();
			  Booking b= new Booking(bID,cInDate, cOutDate, room, customer);
			  reservations.add(b);
			  b1=b;
		   break;
		   
		   case 2:
			 //Checking if the list is empty;
			   if(reservations.size()== 0)
			   {
				   System.out.println("\nThe list is empty\n");
				   break;
			   }
			   
			   //Viewing all reservations made:
			   
			   System.out.println(reservations);
	           break;
		   
		   case 3:
			   
			   //Checking if the list is empty;
			   if(reservations.size()== 0)
			   {
				   System.out.println("\nThe list is empty\n");
				   break;
			   }
			   
			   //viewing a specific reservation details:
			   
			   Scanner bookingId= new Scanner(System.in);
			   System.out.println("Enter the booking ID:");
			   int bid= bookingId.nextInt();
			   int ans = -1;
			  
			   for (int i = 0; i < reservations.size(); i++)
			   {
				   Booking element = reservations.get(i);
				   if (bid == element.getBID())
				   {
		                ans = i;
		                break;
		            }
			   }
			   if (ans == -1) {
		            System.out.println("\nBooking not found\n");
		        }
		        else {
		            System.out.println(
		                "The customer reservations details: \n" + reservations.get(ans));
		        }
			   break;
			   
		   case 4:
			   
			   //Checking if the list is empty;
			   if(reservations.size()== 0)
			   {
				   System.out.println("\nThe list is empty\n");
				   break;
			   }
			   //Deleting a specific reservation:
			   
			   Scanner bookingIdR= new Scanner(System.in);
			   System.out.println("Enter the booking ID:");
			   int bidR= bookingIdR.nextInt();
			   int ansR = -1;
			   
			   for (int i = 0; i < reservations.size(); i++)
			   {
				   Booking element = reservations.get(i);
				   if (bidR == element.getBID())
				   {
		                ansR = i;
		                break;
		            }
			   }
			   if (ansR == -1) {
		            System.out.println("\nBooking not found\n");
		        }
		        else {
		            System.out.println(
		                "\nThe reservation: \n" + reservations.get(ansR) + "is deleted successfully\n");
		            reservations.remove(ansR);
		        }
			  // System.out.println(info.getroom());
			   break;
			   
		   case 5:
			   
			   //Viewing all staff members: 
			   
			   info.allStaff();
			   break;
			   
		   case 6:
			   
			   //existing the program
			   break;
			   
			   default:
				   
				   System.out.println("\nYou must choose a number from the menu:\n");
				   
			   
		   }
	   
	     } while(x!=6);
	   
	}

}
