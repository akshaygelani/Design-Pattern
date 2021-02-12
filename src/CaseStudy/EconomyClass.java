package CaseStudy;

public class EconomyClass extends Car{
	
	private static BasicCharges charges = new BasicCharges();
	
	private static double basicRentalFare = charges.ECONOMY_basicRentalFare;
	private static int discount = charges.ECONOMY_discount ;
	private static int corporateDiscount = charges.ECONOMY_corporateDiscount;
	private static int serviceTax = charges.ECONOMY_serviceTax;
	private static int freeHrs = charges.ECONOMY_freeHrs;
	private static int freeKm = charges.ECONOMY_freeKm;
	private static double extraKmRate = charges.ECONOMY_extraKmRate;
	private static double extraHrsRate = charges.ECONOMY_extraHrsRate;
	
	EconomyClass(int usedHrs, int usedKm) {
		super(basicRentalFare, discount, corporateDiscount, serviceTax, freeHrs, freeKm, 
				extraKmRate, extraHrsRate, usedHrs,usedKm);
	}
}
