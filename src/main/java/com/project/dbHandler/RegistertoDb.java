package com.project.dbHandler;

import java.sql.*;

public class RegistertoDb {
	
	public static void InsertData(String email, String password, String address,String gender)
	{
		//jdbc code     
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String  user="system";
		String pass="System";
		String sql="INSERT INTO user_info VALUES(?,?,?,?)";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, address);
			ps.setString(4, gender);
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
