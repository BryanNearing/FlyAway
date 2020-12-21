package com.Flight;

public class Flight {

	private int id;
	private String source;
	private String destination;
	private String airline;
	private float ticketPrice;
	private int numSeats;
	private String flightTime;
	
	public Flight(int id, String source, String destination, String airline, float ticketPrice, int numSeats,
			String flightTime) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.ticketPrice = ticketPrice;
		this.numSeats = numSeats;
		this.flightTime = flightTime;
	}
	
	public Flight(String source, String destination, String airline, float ticketPrice, int numSeats,
			String flightTime) {
		super();
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.ticketPrice = ticketPrice;
		this.numSeats = numSeats;
		this.flightTime = flightTime;
	}

	
	public int getId() {
		return this.id;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	@Override
	public String toString() {
		return "Flight [source=" + source + ", destination=" + destination + ", airline=" + airline + ", ticketPrice="
				+ ticketPrice + ", numSeats=" + numSeats + ", flightTime=" + flightTime + "]";
	}
	
	
	
}
