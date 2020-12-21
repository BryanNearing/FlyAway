package com.Dao;

import java.sql.*;

public class AdminDao {
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

	public static int save(String password) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into Places(name) values(?)");
			ps.setString(1, password);
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static int update(String password){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("update AdminInfo set password=? where username = 'admin'");
			ps.setString(1, password);
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static String[] getUserPass(){
		String[] userPass = new String[2];
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select username, password from AdminInfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				userPass[0] = rs.getString("username");
				userPass[1] = rs.getString("password");
			}
		}catch(Exception e){System.out.println(e);}
		return userPass;
	}
	
	public static boolean correctLoginInfo(String username, String password) {
		boolean correctInfo = false;
		
		String[] userPass = getUserPass();
		if(username.equals(userPass[0]) && password.equals(userPass[1]))
			correctInfo = true;
		
		return correctInfo;
	}
	
}
