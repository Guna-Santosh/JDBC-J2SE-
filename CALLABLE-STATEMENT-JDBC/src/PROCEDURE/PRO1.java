package PROCEDURE;
import java.sql.*;
import oracle.jdbc.*;
import oracle.jdbc.OracleTypes;
public class PRO1
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
		//Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santhosh","chinnu");
		System.out.println(con);
		//System.out.println(con1);
		CallableStatement cst=con.prepareCall("{call getallempinfo2(?,?)}");
		cst.setInt(1, 1000);
		cst.registerOutParameter(2, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs=(ResultSet)cst.getObject(2);
		boolean flag=false;
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("------------------------");
		while(rs.next()) 
		{
			flag=true;
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));			
		}
		if(flag==false) 
		{
			System.out.println("no record found");
			
		}
		
	}
   
}//END OF CLASS
