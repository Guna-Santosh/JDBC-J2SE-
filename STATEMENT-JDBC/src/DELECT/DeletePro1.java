package DELECT;
import java.sql.*;
import java.util.Scanner;

import oracle.net.aso.s;

public class DeletePro1 
{
	public static void main(String[] args) throws Exception
	{
     
		
	 Scanner s=new Scanner(System.in);
     System.out.print("ENTER THE PROCODE = ");//1st column
     String pc=s.nextLine();

     Connection con = DriverManager.getConnection
    		 ("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
     
     Statement stm=con.createStatement();
     
     int k=stm.executeUpdate("delete  product48 where code=('"+pc+"')");
     
      if(k>0) 
      {
    	  System.out.println("PRODUCT DETAILS SUCCESSFULLY DELETE ");
      }//end of if
     
     
             
    
     
         
	}//end of main()

	
	
	
}//end of class
