package com.Dao;

import java.sql.*;
import java.util.ArrayList;

public class PlaceDao {
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

	public static int save(String place) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into Places(name) values(?)");
			ps.setString(1, place);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int delete(String place) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Places where name=?");
			ps.setString(1, place);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return status;
	}
	
	public static ArrayList<String> getAllPlaces(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		ArrayList<String> list = new ArrayList();
		try{
			PreparedStatement ps=con.prepareStatement("select * from Places");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				list.add(rs.getString("name"));
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
