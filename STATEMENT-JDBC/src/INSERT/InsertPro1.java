package INSERT;
import java.sql.*;
import java.util.*;
public class InsertPro1
{
	public static void main(String[] args) throws Exception
	{
    
		
	 Scanner s=new Scanner(System.in);
     System.out.print("ENTER THE PROCODE = ");//1st column
     String pc=s.nextLine();//pcode
     System.out.print("ENTER THE PRODNAME = ");//2nd column
     String pn=s.nextLine();//pname
     System.out.print("ENTER THE PRODPRICE = ");//3nd column
     float pp=Float.parseFloat(s.nextLine());//pprice
     System.out.print("ENTER THE PRODQNTY = ");
     int pq=Integer.parseInt(s.nextLine());//pqnty
     Connection con = DriverManager.getConnection
    		 ("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
     
     Statement stm=con.createStatement();
     
     int k=stm.executeUpdate("insert into  product48 values('"+pc+"','"+pn+"',"+pp+","+pq+")");
     
      if(k>0) 
      {
    	  System.out.println("INSERT DETAILS SUCCESSFULLY ");
      }//end of if
     
     
     
     
	}//end of main()

}//end of class
