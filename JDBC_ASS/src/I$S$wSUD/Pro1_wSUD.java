package I$S$wSUD;
import java.sql.*;
import java.util.*;
public class Pro1_wSUD 
{
    public static void main(String[] args) {
		try 
		{
		  Scanner s=new Scanner(System.in);
			Connection con =DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
			PreparedStatement ps1 =con.prepareStatement("select *from employee48 where id=?");
			PreparedStatement ps2 =con.prepareStatement("update employee48 set bsal=?,totsal=? where id=?");
			PreparedStatement ps3 =con.prepareStatement("delete from employee48 where id=?");
            System.out.print("ENTER THE ID = ");
			String id=s.nextLine();
			ps1.setString(1, id);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) 
			{
				switch(Integer.parseInt(s.nextLine())) 
				{
				case 1:
					
					
					
					
					break;
				case 2:
					break;
				case 3:
					break;
				}//end of switch
			}//END OF IF
			else 
			{
				System.out.println("INVALID EMPID....");
			}//END OF ELSE
			
			s.close();
		}//end of try
		catch(Exception e) {e.printStackTrace();}//end of catch
    	
	}//end of main
}//end of class
