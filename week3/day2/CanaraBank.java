package week3.day2;

public abstract class CanaraBank implements Payments {
	
	
	public void cashOnDelivery() {System.out.println("cashondelivery");};
	public void UpiPayments()
	{System.out.println("UpiPayments");};
	public void cardPayments()
	{System.out.println("cardPayments");};
	public void internetBanking()
	{System.out.println("internetBanking");};
	
	public abstract void recordPaymentDetails();{}
	
	

}
