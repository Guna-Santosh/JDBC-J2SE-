package test;
import java.util.*;
import java.sql.*;
/*JDBC application will perform auto-commit operations ,
     which commit operation is performed automatically */

//task
/*Transfer AMT:3000 from ACNO: 6123456 to ACCNO: 313131
    subT1=subtract 3000 from ACNO:6123456
    subT2=add 3000 to ACNO:313131
  */
public class MoneyTransaction 
{
	public static void main(String[] args) 
	{
           try {
        	   Scanner s=new Scanner(System.in);
        	   Connection con=DriverManager.getConnection
        		  ("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
      
        	    System.out.println("commit status : "+con.getAutoCommit());
        	    con.setAutoCommit(false);
        	    System.out.println("commit status : "+con.getAutoCommit());
		
        	PreparedStatement ps1=  con.prepareStatement
					           ("select *from Bank48 where accno=?");	   
			PreparedStatement ps2=  con.prepareStatement
					           ("update Bank48 set balance=balance+? where accno=?");   
			  Savepoint sp=con.setSavepoint();
				System.out.println("ENTER HOME-ACCOUNT-NO : ");
        	    long hAccNo=s.nextLong();//6123456
        	    ps1.setLong(1, hAccNo);//ps1=?
        	    ResultSet rs1=ps1.executeQuery();
        	    if(rs1.next()) 
        	    {
        	    	float bal=rs1.getFloat(3);//12000
        	    	System.out.println("ENTER BENFIECIERY ACC NO : ");
        	    	long bAccNo=s.nextLong();//313131
        	    	ps1.setLong(1, bAccNo);//ps2=?
        	    	ResultSet rs2=ps1.executeQuery();
        	    	
        	    	if(rs2.next()) 
        	    	{
        	    		System.out.println("ENTER AMOUNT TO BE TRANSFERRED : ");
        	    		float amt=s.nextFloat();//3000
        	    		if(amt<=bal) 
        	    		{
        	    			ps2.setFloat(1, -amt);
        	    			ps2.setLong(2, hAccNo);
        	    			int i=ps2.executeUpdate();
        	    			
        	    			ps2.setFloat(1, amt);
        	    			ps2.setLong(2, bAccNo);
        	    			int j=ps2.executeUpdate();
	        	    			if(i==1&&j==1) 
	        	    			{
	        	    				con.commit();
	        	    				System.out.println("\n\tTransaction successfully");
	        	    }else {
	        	   			con.rollback(sp);
	        	   			System.err.println("Transaction failed");
	        	   		 }//else line 59
        	    	}else {
        	    		    System.err.println("Insufficient funds");
        	    		  }//else line 64
        	    	
        	    	}else {
        	    		      System.err.println("invalid bAccNo");
        	    		  }
        	       }else {
        	    		    System.err.println(" invalid hAccNo");
        	    		  }
        }catch(Exception e) {e.printStackTrace();}
	}

}
