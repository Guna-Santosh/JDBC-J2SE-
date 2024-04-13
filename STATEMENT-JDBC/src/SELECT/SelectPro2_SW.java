package SELECT;

import java.sql.*;
import java.util.Scanner;

public class SelectPro2_SW
{
	public static void main(String[] args) 
	{
     try {
		
	 Scanner s=new Scanner(System.in);
     System.out.print("ENTER THE PROCODE = ");//1st column
     String pc=s.nextLine();
     Connection con = DriverManager.getConnection
    ("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");	
    //API:PRODUCT_N:DRIVER:LOCATION:PNO:SERVICE_N:O_USER_N:O_PW	
     Statement stm =con.createStatement();
		ResultSet rs=stm.executeQuery("select*from product48 where code='"+pc+"'");
     
     //int k=stm.executeUpdate("select+from product48 where code=('"+pc+"')");
     
      if(rs.next()) 
      {
    		System.out.println(rs.getString(1)+"\t"
		              +rs.getString(2)+"\t"
			          +rs.getString(3)+"\t"
		              +rs.getString(4));
      }//end of if
      else 
      {
    	  System.out.println("INVALID PRODCODE....");
      }
     }
             
     catch(Exception e) {e.printStackTrace();}
     
     
	}//end of main()

	
}
