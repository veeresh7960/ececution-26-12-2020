package com.xworkz.flightbooking;

public class FlightBooking {
	private long airPlaneCode;
	private String company;
	private String StartingPoint;
	private String destination;
	private int noOfSeats;
	private int businessClassPrice;
	private int domestiClassPrice;
	private int economyClassPrice;

	/**
	 * @param airPlaneCode
	 * @param company
	 * @param startingPoint
	 * @param destination
	 * @param noOfSeats
	 * @param businessClassPrice
	 * @param domestiClassPrice
	 * @param economyClassPrice
	 */
	public FlightBooking(long airPlaneCode, String company, String startingPoint, String destination, int noOfSeats,
			int businessClassPrice, int domestiClassPrice, int economyClassPrice) {
		this.airPlaneCode = airPlaneCode;
		this.company = company;
		this.StartingPoint = startingPoint;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.businessClassPrice = businessClassPrice;
		this.domestiClassPrice = domestiClassPrice;
		this.economyClassPrice = economyClassPrice;
	}

	public void displayAirplaneInfo() {

		System.out.println("airplanecode : " + this.airPlaneCode);
		System.out.println("companyName is: " + this.company);
		System.out.println("flight starting from : " + this.StartingPoint);
		System.out.println("flight landing at : " + this.destination);
		System.out.println("no of Seats avilable in flight  : " + this.noOfSeats);
		System.out.println("domestic  flight seatprice  : " + this.domestiClassPrice);
		System.out.println(" business flight seatprice  : " + this.businessClassPrice);
		System.out.println("economy flight seatprice : " + this.economyClassPrice);

	}

	public void checkAvilabilityFlight() {
		if (this.domestiClassPrice <= 500) {
			System.out.println("the seats avilabe for domeststic");
		} else {
			System.out.println("seats are not avilabe for domeststic");
		}

		if (this.businessClassPrice <= 700) {
			System.out.println("seats are avilable for businessClass");
		} else {
			System.out.println("Seats are not avilable ");
		}
		if (this.economyClassPrice <= 1000) {
			System.out.println("seats avilable for economy");
		}

	}
}
