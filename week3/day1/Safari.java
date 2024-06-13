package week3.day1;

public class Safari extends Browser {
	
	
	public void readerMode() {
		// TODO Auto-generated method stub
		System.out.println("iam from Creadermode");
	}
	
	
	public void fullscreenmode() {
		// TODO Auto-generated method stub
		System.out.println("iam from Cfullscreenmode");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari C = new Safari();
		
		C.closeBrowser();
		C.openURL();
		C.navigateback();

	}

}
