package test;
import java.sql.*;
public class Dbcon1 
{
   public static void main(String[] args)
   {
	try 
	{
	 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");	
	Statement stm =con.createStatement();
	ResultSet rs=stm.executeQuery("select*from emp where ename='SMITH'");
	 while (rs.next()) 
	 {
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getString(5));
	 }//loop end 

	}//try 
	catch(Exception e)
	{
		e.printStackTrace();
	}//end of catch
	
   }//end of main
}//end of class
