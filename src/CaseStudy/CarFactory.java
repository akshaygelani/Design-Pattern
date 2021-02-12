package CaseStudy;

public class CarFactory {
	
	Car getCar(CarType carType,int UsedHrs, int UsedKm) {
		if(carType == CarType.Economy) {
			return new EconomyClass(UsedHrs,UsedKm);
		}else if(carType == CarType.Executive) {
			return new ExecutiveClass(UsedHrs,UsedKm);
		}else if(carType == CarType.SUV) {
			return new SUVClass(UsedHrs,UsedKm);
		}
		return null;
	}
}
