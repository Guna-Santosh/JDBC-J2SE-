package MIXING_QU;
import java.sql.*;
import java.util.*;
public class S$I_PRO1 
{
   public static void main(String[] args) {
	    try 
	    {
	    	Scanner s=new Scanner(System.in);
	   Connection con=DriverManager.getConnection
	    	("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
	  PreparedStatement ps1 = con.prepareStatement("insert into product48 values(?,?,?,?)");
	  PreparedStatement ps2=con.prepareStatement(" select*from product48");
	    	while(true) 
	    	{
	    		System.out.println("*****CHOISE*****");
	    		System.out.println("1.ADD-PRO-DETAILS\n2.VIEW-PRO'S\n3.EXIT");
	    	   switch(Integer.parseInt(s.nextLine())) 
	    	   {
	    	   case 1:
	    		   System.out.println("ENTER THE CODE");
	    		   String c=s.nextLine();
	    		   System.out.println("ENTER THE NAME = ");
	    		   String N=s.nextLine();
	    		   System.out.println("ENTER THE price = ");
	    		  // float P=s.nextFloat();
	    		  float P=Float.parseFloat(s.nextLine());
	    		   System.out.println("ENTER THE QTY = ");
	    		   int Q=Integer.parseInt(s.nextLine());
	    		  //int Q=s.nextInt();
	    		  ps1.setString(1, c);//set is help like a scanf
	    		  ps1.setString(2, N);
	    		  ps1.setFloat(3,P);
	    		  ps1.setInt(4, Q);
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
	    			                    rs.getString(4)
	    					            );   //get is help like a printf
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
