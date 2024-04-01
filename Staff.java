package HP;

public class Staff 
{
	
	//Declared variables:
	
	private final String sFname;
	private final String sLname;
	private final String SID;
	private final String Job;
	private double Salary;
	
	
	//constructor
		public Staff ( String sFname,String sLname,String SID,String Job, double Salary)
		{
			this.sFname=sFname;
			this.sLname=sLname;
			this.SID=SID;
			this.Job=Job;
			this.Salary=Salary;
		}
		
		
		
		//These are the getters of variables
		
		 public String getsFname()
		 {
			 return sFname;
		 }
		 
		 
		 public String getsLname()
		 {
			 return sLname;
		 }
		 
		 
		 public String getSID()
		 {
			 return SID;
		 }
		 
		 
		 public String getsJob()
		 {
			 return Job;
		 }
		 
		 
		 public double Salary()
		 {
			 return Salary;
		 }
		 
		 
		 //The setter 
		 public void setSalary(double x)
		 {
			 Salary=x;
		 }
		 
		 
		 
		//Over-riding the toString() function:
		 @Override
		 public String toString()
		 {
			 return String.format("%s: %s %s %n%s: %s %n%s: %s %n%s: %.2f %n%n",
					 "Staff Name", sFname,sLname, "Staff ID",SID,
					 "Staff Job", Job, "Staff Salary", Salary );
		 }
	
	
}
