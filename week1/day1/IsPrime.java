package week1.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 20 ;
		
		
		
		for (int i = 2 ; i<= n ; i++) 
		{
			int flag = 0 ;
			
			for ( int j= 2 ; j < i ; j++) {
				
				if (i%j == 0) {
					
					flag = 1;
					break;
				}
				
				
				
			}
			if (flag == 0) {
				System.out.println(i + "Is a prime number");
			}
			
			
		}

	}

}
