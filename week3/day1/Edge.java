package week3.day1;

public class Edge extends Browser {
	
	
	public void takesnap() {
		// TODO Auto-generated method stub
		System.out.println("from Ctakesnap");

	}
	
	public void clearcookies() {
		// TODO Auto-generated method stub
		System.out.println("from Cclearcookies");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge E = new Edge();
		
		E.clearcookies();
		E.closeBrowser();
		E.navigateback();
		E.openURL();
		E.takesnap();
		
	}

}
