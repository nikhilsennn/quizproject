package com.project.admin;
import java.sql.*;
import java.util.ArrayList;

public class Qbank {

		public static void add(String qid, String ques, String opA, String opB, String ans) {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "System";
			String sql = "INSERT INTO qbank VALUES(?,?,?,?,?)";
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Integer.parseInt(qid));
				ps.setString(2, ques);
				ps.setString(3, opA);
				ps.setString(4, opB);
				ps.setString(5, ans);
				ps.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static ArrayList fetchDb(int qs) {
			ArrayList al = new ArrayList();

			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "System";
			String sql = "SELECT * FROM qbank WHERE q_id=?";
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, qs);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					String q = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getString(4) + ":"
							+ rs.getString(5);
					al.add(q);
					System.out.println(rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getString(3) + ": "
							+ rs.getString(4) + ": " + rs.getString(5));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("problem occur ");
				e.printStackTrace();
			}
			System.out.println(al);
			return al;
		}

	}

