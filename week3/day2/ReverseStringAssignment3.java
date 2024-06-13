package week3.day2;

public class ReverseStringAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Given input string
		        String test = "Ia am a software tester";

		        // Step 1: Split the words and have it in an array
		        String[] words = test.split(" ");

		        // Step 2: Traverse through each word using a loop
		        for (int i = 0; i < words.length; i++) {
		            // Step 3: Check if the index is odd (1-based odd positions are 2, 4, 6,... so 0-based are 1, 3, 5,...)
		            if (i % 2 != 0) {
		                // Step 4: Reverse the word if the index is odd
		                words[i] = new StringBuilder(words[i]).reverse().toString();
		            }
		        }

		        // Step 5: Join the words back into a single string with spaces and print the result
		        String result = String.join(" ", words);
		        System.out.println(result);
		    }
		}



