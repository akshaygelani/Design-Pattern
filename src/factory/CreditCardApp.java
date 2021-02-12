package factory;

abstract class CreditCard{
	private String cardNumber,cardHolder,expiryDate;
	
	CreditCard(String cardNumber,String cardHolder,String expiryDate){
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.expiryDate = expiryDate;
	}
	
	abstract void getCardDetails();
	
	String getCardHolderName() {
		return cardHolder;
	}
	String getCardNumber() {
		return cardNumber;
	}
	String getexpiryDate() {
		return expiryDate;
	}
}

class VisaCC extends CreditCard{
	VisaCC(String cardNumber,String cardHolder,String expiryDate){
		super(cardNumber,cardHolder,expiryDate);
	}
	
	@Override
	public void getCardDetails() {
		System.out.println("---> Visa Card Details :");
		System.out.println(getCardNumber());
		System.out.println(getCardHolderName());
		System.out.println(getexpiryDate());
	}
}

class MasterCC extends CreditCard{
	
	MasterCC(String cardNumber,String cardHolder,String expiryDate){
		super(cardNumber,cardHolder,expiryDate);
	}
	@Override
	public void getCardDetails() {
		System.out.println("---> Master Card Details");
		System.out.println(getCardNumber());
		System.out.println(getCardHolderName());
		System.out.println(getexpiryDate());
	}
}

class AmexCC extends CreditCard{
	
	AmexCC(String cardNumber,String cardHolder,String expiryDate){
		super(cardNumber,cardHolder,expiryDate);
	}
	@Override
	public void getCardDetails() {
		System.out.println("---> Amex Card Details");
		System.out.println(getCardNumber());
		System.out.println(getCardHolderName());
		System.out.println(getexpiryDate());
	}
}

class CreditFactory {
	
	CreditCard getCard(CardType cardType) {
		if(cardType == CardType.VISA) {
			return new VisaCC("11111111","ABC","05/2025");
		}else if(cardType == CardType.MASTER) {
			return new MasterCC("2222222","ABC","03/2021");
		}else if(cardType == CardType.AMEX) {
			return new AmexCC("333333","ABC","04/2022");
		}
		return null;
	}
}

enum CardType{
	VISA,
	MASTER,
	AMEX
}

public class CreditCardApp {
	public static void main(String args[]) {
		CreditFactory factory = new CreditFactory();
		
		//VISA Card
		CreditCard card1 = factory.getCard(CardType.VISA);
		card1.getCardDetails();

		//MASTER Card
		CreditCard card2 = factory.getCard(CardType.MASTER);
		card2.getCardDetails();
		
		//AMERICAN EXPRESS Card
		CreditCard card3 = factory.getCard(CardType.AMEX);
		card3.getCardDetails();
	}
}
