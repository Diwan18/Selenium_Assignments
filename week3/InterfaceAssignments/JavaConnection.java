package week3.InterfaceAssignments;

public class JavaConnection implements DataBaseConnection {


		
	public void connect() {System.out.println("Connect With Database");
	} 
	
	@Override
	public void disconnect() {System.out.println("DisConnect With Database");
	}
	@Override
	public void executeUpdate() {System.out.println("Execute Update With Database");
	} 
	
	
	public static void main(String[] args) {
		JavaConnection connection = new JavaConnection();
		
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		
		
		
		
	}
	

	}



