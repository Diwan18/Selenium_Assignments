package week3.AbstractioninJava;

public class JavaConnection extends MySqlConnection {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection C = new JavaConnection();
		
		C.connect();
		C.disconnect();
		C.executequery();
		C.executeUpdate();
		
		

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect With Abstract Database");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect With Abstract Database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute Update With Abstract Database");
		
	}
	
	
	public void executequery() {
		// TODO Auto-generated method stub
		
		System.out.println("The Query  Executed");

	}

}
