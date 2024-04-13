package MIXING_QU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class S$I_empro2 
{ 
	public static void main(String[] args) {	
	try 
    {  //this code for employee48 table in oracle
    	Scanner s=new Scanner(System.in);
   Connection con=DriverManager.getConnection
    	("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
  PreparedStatement ps1 = con.prepareStatement("insert into employee48 values(?,?,?,?,?)");
  PreparedStatement ps2=con.prepareStatement(" select*from  employee48");
    	while(true) 
    	{
    		System.out.println("*****CHOISE*****");
    		System.out.println("1.ADD-EMP-DETAILS\n2.VIEW-EMP'S\n3.EXIT");
    	   switch(Integer.parseInt(s.nextLine())) 
    	   {
    	   case 1:
    		   System.out.print("ENTER THE ID = ");
    		   String I=s.nextLine();
    		   
    		   System.out.print("ENTER THE NAME = ");
    		   String N=s.nextLine();
    		   
    		   System.out.print("ENTER THE JROLL = ");
    		   String J=s.nextLine();
    		   
    		   System.out.print("ENTER THE BASSAL = "); 
    		   int B=Integer.parseInt(s.nextLine());
    		   
    		   //System.out.print("ENTER THE TOTSAL = ");
    		   float T=(+(0.98F+B)+(0.87F+B));    		  
    		  ps1.setString(1,I);//set is help like a scanf
    		  ps1.setString(2,N);
    		  ps1.setString(3,J);
    		  ps1.setInt(4,B);
    		  ps1.setFloat(5,T);
    		   int k=ps1.executeUpdate();
    		   if(k>0) 
    		   {
    			   System.out.println("ONE EMP ADDED SUCCESSFULLY...");
    		   }//end of case-1 if
    		   break;//END OF CASE-1
    	   case 2:
    		   ResultSet rs=ps2.executeQuery();
    		   while(rs.next()) 
    		   {
    			System.out.println(
    					            rs.getString(1)+"\t"+
    			                    rs.getString(2)+"\t"+
    					            rs.getString(3)+"\t"+
    			                    rs.getString(4)+"\t"+
    			                    rs.getString(5));   //get is help like a printf
    		   }//end of case-2 while 
    	       break;
    	   case 3:
    		   System.out.println("OPERATION STOP..");
    		   System.exit(0);
    		   break;
    		   default : 
    			   System.out.println("INVALID CHOISE.....\n");
    	   
    	   }//end of switch 	
    	}//end of while loop
    }//end of try
    catch(Exception e) {e.printStackTrace();}//end of catch
}//end of main()
}//end of class
