package week3.day2;

public class Amazon extends CanaraBank {
	
	@Override
	public void recordPaymentDetails() {
		System.out.println("recordPaymentDetails");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon A = new Amazon();
		A.cardPayments();
		A.cashOnDelivery();
		A.internetBanking();
		A.recordPaymentDetails();
		A.UpiPayments();

	}

}
