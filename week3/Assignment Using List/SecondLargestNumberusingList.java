package listInterface;

import java.util.Arrays;

public class SecondLargestNumberusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { 3, 2, 11, 4, 6, 7 };
		
		Arrays.sort(A);
		
		
		
		for (int number : A) {
            System.out.print(number + " ");}
		
		System.out.println();
		
		
		

		System.out.println("From the last to second number is:");

		for (int i = 0; i < A.length; i++) {
			

			if (A[i] == A[A.length - 2]) {
				System.out.println(A[i]);
			}

		}

	}

}
