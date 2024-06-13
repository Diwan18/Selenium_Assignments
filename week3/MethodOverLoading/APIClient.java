package week3.MethodOverLoading;



public class APIClient {
	
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
		
		System.out.println(endpoint);
		System.out.println();

	}
	
	public void sendRequest(String endpoint,String requestbody, boolean requeststatus) {
		// TODO Auto-generated method stub
		
		if (requeststatus = true) {
			
			System.out.println(endpoint);
			System.out.println(requestbody);
			System.out.println("Status Active");
		}
		
		}
	
	
	public static void main(String[] args) {
		
		
		APIClient MO = new APIClient();
		
		MO.sendRequest("Hi");
		MO.sendRequest("Hello", "How are you?", true);
	
	}
	
	
	
	
}
