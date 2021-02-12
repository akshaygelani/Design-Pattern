package CaseStudy;

public class ExecutiveClass extends Car {
	
	private static BasicCharges charges = new BasicCharges();
	
	private static double basicRentalFare =charges.EXECUTIVE_basicRentalFare;
	private static int discount = charges.EXECUTIVE_discount;
	private static int corporateDiscount = charges.EXECUTIVE_corporateDiscount;
	private static int serviceTax = charges.EXECUTIVE_serviceTax;
	private static int freeHrs = charges.EXECUTIVE_freeHrs;
	private static int freeKm = charges.EXECUTIVE_freeKm;
	private static double extraKmRate = charges.EXECUTIVE_extraKmRate; 
	private static double extraHrsRate = charges.EXECUTIVE_extraHrsRate;
	
	ExecutiveClass(int usedHrs, int usedKm) {
		super(basicRentalFare, discount, corporateDiscount, serviceTax, freeHrs, freeKm, 
					extraKmRate, extraHrsRate, usedHrs,usedKm);
	}		
}
