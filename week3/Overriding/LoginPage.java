package week3.Overriding;

public class LoginPage extends Basepage {
	
	
	
	
	
	@Override
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		System.out.println("Perform Common Task in LoginPage");

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage LP = new LoginPage();
		LP.findElement();
		LP.clickElement();
		LP.enterText();
		LP.findElement();
		LP.performCommonTasks();
		
		Basepage BP = new Basepage();
		BP.performCommonTasks();
		
		

	}

}
