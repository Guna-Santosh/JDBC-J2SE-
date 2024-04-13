package inserting_data;
import java.sql.*;
import java.util.Scanner;

public class Sdelete 
{
	public static void main(String[] args) 
	{
     try {
		
	 Scanner s=new Scanner(System.in);
     System.out.print("ENTER THE PROCODE = ");//1st column
     String pc=s.nextLine();

     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
     
     Statement stm=con.createStatement();
     
     int k=stm.executeUpdate("delete  product48 where code=('"+pc+"')");
     
      if(k>0) 
      {
    	  System.out.println("PRODUCT DETAILS SUCCESSFULLY DELETE ");
      }//end of if
     
     }
             
     catch(Exception e) {e.printStackTrace();}
     
     
	}//end of main()

	
	
	
}//end of class
