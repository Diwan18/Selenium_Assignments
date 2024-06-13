package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	        // Step 1: Declare a String array and add values
	        String[] companiesArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        // Step 2: Add the array elements to a list
	        List<String> companiesList = new ArrayList<>();
	        Collections.addAll(companiesList, companiesArray);

	        // Step 3: Sort the list in ascending order
	        Collections.sort(companiesList);

	        // Step 4: Iterate over the list in reverse order and print
	        System.out.print("Sorted and reversed list: ");
	        for (int i = companiesList.size() - 1; i >= 0; i--) {
	            System.out.print(companiesList.get(i));
	            if (i > 0) {
	                System.out.print(", ");
	            }
	        }

	}

}
