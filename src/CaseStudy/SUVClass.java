package CaseStudy;

public class SUVClass extends Car{
	
	private static BasicCharges charges = new BasicCharges();
	
	private static double basicRentalFare =charges.SUV_basicRentalFare;
	private static int discount = charges.SUV_discount ;
	private static int corporateDiscount = charges.SUV_corporateDiscount;
	private static int serviceTax = charges.SUV_serviceTax;
	private static int freeHrs = charges.SUV_freeHrs;
	private static int freeKm = charges.SUV_freeKm;
	private static double extraKmRate = charges.SUV_extraKmRate;
	private static double extraHrsRate = charges.SUV_extraHrsRate;
	
	SUVClass(int usedHrs, int usedKm) {
		super(basicRentalFare, discount, corporateDiscount, serviceTax, freeHrs, freeKm, 
				extraKmRate, extraHrsRate, usedHrs,usedKm);
	}
	
}
