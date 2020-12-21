package com.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Flight.*;

public class FlightDao {
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

	public static int save(Flight f) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values(?,?,?,?,?,?)");
			ps.setString(1, f.getSource());
			ps.setString(2, f.getDestination());
			ps.setString(3, f.getAirline());
			ps.setFloat(4, f.getTicketPrice());
			ps.setInt(5, f.getNumSeats());
			ps.setString(6, f.getFlightTime());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static ArrayList<Flight> getAllFlights(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		ArrayList<Flight> list = new ArrayList();
		try{
			PreparedStatement ps=con.prepareStatement("select * from Flights");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				String airline = rs.getString("airline");
				Float ticketPrice = rs.getFloat("ticketPrice");
				int numSeats = rs.getInt("numSeatsLeft");
				String date = rs.getString("flightTime");
				Flight f = new Flight(id, source, destination, airline, ticketPrice, numSeats, date);
				list.add(f);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static List<Flight> getAllFlightsSearch(String source, String destination, String flightTime, int numSeats){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		List<Flight> list = new ArrayList<Flight>();
		try{
			PreparedStatement ps=con.prepareStatement("select * from Flights where source=? and destination=? and flightTime=? and numSeatsLeft >= ?");
			ps.setString(1, source);
			ps.setString(2, destination);
			ps.setString(3, flightTime);
			ps.setInt(4, numSeats);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String fsource = rs.getString("source");
				String fdestination = rs.getString("destination");
				String airline = rs.getString("airline");
				Float ticketPrice = rs.getFloat("ticketPrice");
				int fnumSeats = rs.getInt("numSeatsLeft");
				String date = rs.getString("flightTime");
				Flight f = new Flight(id, fsource, fdestination, airline, ticketPrice, fnumSeats, date);
				list.add(f);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static int getFlightPrice(int id){
		int price = 0;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try{
			PreparedStatement ps=con.prepareStatement("select ticketPrice from Flights where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				price = rs.getInt("ticketPrice");
			}
		}catch(Exception e){System.out.println(e);}
		return price;
	}
	
	public static int updateTicketNum(int id, int numTickets){
		int status=0;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try{
			PreparedStatement ps=con.prepareStatement("update Flights set numSeatsLeft=(numSeatsLeft - ?) where id=?");
			ps.setInt(1, numTickets);
			ps.setInt(2, id);
			status =ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	

}
