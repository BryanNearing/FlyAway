package com.Dao;

import java.sql.*;
import java.util.ArrayList;

public class AirlineDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(String airline) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into Airlines(name) values(?)");
			ps.setString(1, airline);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int delete(String airline) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Airlines where name=?");
			ps.setString(1, airline);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}
	
	public static ArrayList<String> getAllAirlines(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		ArrayList<String> list = new ArrayList();
		try{
			PreparedStatement ps=con.prepareStatement("select * from Airlines");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				list.add(rs.getString("name"));
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
