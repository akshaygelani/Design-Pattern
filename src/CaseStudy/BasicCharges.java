package CaseStudy;

public class BasicCharges {
	
	//Basic Charges for Economy Car
	public final int ECONOMY_basicRentalFare = 750;
	public final int ECONOMY_discount = 200;
	public final int ECONOMY_corporateDiscount = 0;
	public final int ECONOMY_serviceTax = 6;
	public final int ECONOMY_freeHrs = 8;
	public final int ECONOMY_freeKm = 50;
	public final int ECONOMY_extraKmRate = 8;
	public final int ECONOMY_extraHrsRate = 125;
	
	//Charges for Executive Car
	public final double EXECUTIVE_basicRentalFare =ECONOMY_basicRentalFare*1.5 ;
	public final int EXECUTIVE_discount = ECONOMY_discount*2 ;
	public final int EXECUTIVE_corporateDiscount = 10;
	public final int EXECUTIVE_serviceTax =ECONOMY_serviceTax;
	public final int EXECUTIVE_freeHrs = ECONOMY_freeHrs;
	public final int EXECUTIVE_freeKm = 100;
	public final double EXECUTIVE_extraKmRate = ECONOMY_extraKmRate + (ECONOMY_extraKmRate*50)/100;
	public final double EXECUTIVE_extraHrsRate = ECONOMY_extraHrsRate + (ECONOMY_extraHrsRate*20)/100;
	
	//Charges for SUV Car
	public final double SUV_basicRentalFare = ECONOMY_basicRentalFare*2 ;
	public final int SUV_discount = ECONOMY_discount + (ECONOMY_discount*150)/100;
	public final int SUV_corporateDiscount = 15;
	public final int SUV_serviceTax = ECONOMY_serviceTax;
	public final int SUV_freeHrs = ECONOMY_freeHrs;
	public final int SUV_freeKm = 150;
	public final double SUV_extraKmRate = ECONOMY_extraKmRate + (ECONOMY_extraKmRate*75)/100;
	public final double SUV_extraHrsRate = ECONOMY_extraHrsRate + (ECONOMY_extraHrsRate*50)/100;
	
}
