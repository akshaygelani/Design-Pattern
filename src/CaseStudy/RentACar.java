package CaseStudy;

public class RentACar {
	public static void main(String args[]) {
		
		CarFactory factory = new CarFactory();
		Car car = factory.getCar(CarType.SUV,15,150);
		//System.out.println("Gross Rental Fare is :- "+car.getGrossRentalFare());
		System.out.println("Net Rental Fare is :- "+car.getNetRentalFare());
	}
}
