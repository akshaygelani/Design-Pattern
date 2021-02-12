package CaseStudy;

public abstract class Car {
	private double BasicRentalFare,ExtraKmRate,ExtraHrsRate,NetRentalFare;
	private int Discount, CorporateDiscount, ServiceTax, FreeHrs, FreeKm,UsedHrs ,UsedKm;
	
	Car(double basicRentalFare, int discount, int corporateDiscount, int serviceTax, int freeHrs, int freeKm,
			double extraKmRate, double extraHrsRate, int usedHrs, int usedKm) {
		BasicRentalFare = basicRentalFare;
		Discount = discount;
		CorporateDiscount = corporateDiscount;
		ServiceTax = serviceTax;
		FreeHrs = freeHrs;
		FreeKm = freeKm;
		ExtraKmRate = extraKmRate;
		ExtraHrsRate = extraHrsRate;
		UsedHrs = usedHrs;
		UsedKm = usedKm;
	}
	
	public int getExtraKmUsed() {
		return UsedKm-FreeKm;
	}
	public int getExtraHrsUsed() {
		return UsedHrs-FreeHrs;
	}
	public double getExtraCharge() {
		double ExtraCharge;
		
		if(UsedHrs>FreeHrs && UsedKm<FreeKm) {
			ExtraCharge = getExtraHrsUsed()*ExtraHrsRate;
		}else if(UsedHrs<FreeHrs && UsedKm>FreeKm) {
			ExtraCharge = getExtraKmUsed()*ExtraKmRate;
		}else {
			double TotalRateForExtraKm = getExtraKmUsed()*ExtraKmRate;
			double TotalRateForExtraHrs = getExtraHrsUsed()*ExtraHrsRate;
			
			ExtraCharge = TotalRateForExtraKm>TotalRateForExtraHrs ? TotalRateForExtraKm : TotalRateForExtraHrs;
		}
		
		return ExtraCharge;
	}
	public double getTotalFare() {
		return BasicRentalFare + getExtraCharge();
	}
	
	public double getGrossRentalFare() {
		return getTotalFare() - Discount;
	}

	public double getNetRentalFare() {
		return getGrossRentalFare() +(getTotalFare()*ServiceTax)/100;
	}

}
