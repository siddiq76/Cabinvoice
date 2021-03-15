package com.CabInvoice.CabInvoice;



import java.util.List;

/**
 * Generates invoice for cab ride
 * 
 *
 */
public class InvoiceGenerator {

	/**
	 * @return the fare for a single ride
	 */
	public static Double totalFare(double distance, double time) {
		final double fare = 10*distance + time;
		if(fare < 5)
			return 5.0;
		else
			return fare;
	}

	/**
	 *  listOfRides the rides for which aggregate is to be calculated
	 * @return, returns the aggregate of fares
	 */
	public static Double aggragateFare(List<Ride> listOfRides) {
		double aggragateFare = 0;
		for(Ride ride: listOfRides) {
			double fare = totalFare(ride.getDistance(), ride.getTime());
			ride.setFare(fare);
			aggragateFare += fare;
		}
		return aggragateFare;
	}
	
}