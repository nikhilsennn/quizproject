package com.project.dbHandler;

import java.sql.*;

public class Validator {
	
	public static boolean validate(String email,String webpass)
	{
		String dbpass=Validator.fetchData(email);
		if(webpass.equals(dbpass))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	public static String fetchData(String email) {
		//jdbc code
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="System";
		String sql="SELECT pass FROM user_info WHERE email=?";
		String db_pass="";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			rs.next();
			db_pass=rs.getString(1);
		} catch (Exception e) {
		     System.out.println("Problem in fetching data");
			 e.printStackTrace();
		}
		return db_pass;
	}
	
}
