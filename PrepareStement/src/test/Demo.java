package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws SQLException 
	{
		String s1="jdbc:",s2="",s3="";
		try(Connection con = DriverManager.getConnection(s1,s2,s3))
		{
		   	
		}
	}

}
