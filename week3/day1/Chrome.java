package week3.day1;

public class Chrome extends Browser {
	
	
	public void openincognito() {
		// TODO Auto-generated method stub
		System.out.println("from Copenincognito");

	}
	
	public void clearCache() {
		// TODO Auto-generated method stub
		System.out.println("from CclearCache");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome c = new Chrome();
		c.clearCache();
		c.openURL();
		c.openincognito();
		c.closeBrowser();
		c.navigateback();

	}

}
