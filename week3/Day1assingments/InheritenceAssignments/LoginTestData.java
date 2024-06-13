package week3.Day1assingments.InheritenceAssignments;

public class LoginTestData extends TestData {
	
	public void enterUserName() {
		// TODO Auto-generated method stub
		
		System.out.println("enterUserName");

	}
	
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("enterPassword");

	}
	
	public static void main(String[] args) {

		LoginTestData LoginTD = new LoginTestData();
		
		LoginTD.enterUserName();
		LoginTD.enterPassword();
		LoginTD.enterCredentials();
		LoginTD.navigateToHomePage();
	}
	

	

}
