package listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int[] Numbers = {1, 2, 3, 4, 10, 6, 8};
	        List<Integer> numbers = new ArrayList<>();
	        for (int number : Numbers) {
	            numbers.add(number);
	        }

	        //  Sort the list in ascending order
	        Collections.sort(numbers);

	        // Check for gaps in the sequence and print the number if a gap is detected
	        System.out.println("Numbers with gaps in the sequence: ");
	        for (int i = 0; i < numbers.size()-1 ; i++) {
	            int current = numbers.get(i);
	            
	            int next = numbers.get(i + 1);
	            if (current + 1 != next) {
	                System.out.println(current + " ");
	            }
	        }
		
		
		
		

	}

}
