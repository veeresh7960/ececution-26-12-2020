package com.xworkz.flightbooking;

public class AirplaneApplication {

	public static void main(String[] args) {
		FlightBooking booking = new FlightBooking(1030838, "KingFisher", "Benglore", "uttarpradesh", 15, 500, 600, 900);
		booking.displayAirplaneInfo();

		booking.checkAvilabilityFlight();
	}

}
