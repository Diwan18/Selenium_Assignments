package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 20 ;
		
		
		
		for (int i = 1 ; i<= n ; i++) {
			
			if (i>0 & i <=3){
				System.out.println("The given number" + i + "is prime number");
				
			}
			
			else if (i%2 == 0) {
				System.out.println("The number" + i + "is not a prime number ");
			}
			
			else 
			{
					System.out.println(i + "Is a prime number ");
				
			}
			
			
		}

	}

}
