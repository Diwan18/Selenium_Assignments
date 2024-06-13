package week3.day2;

import java.util.Arrays;

public class RemoveDuplicateStringAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		       
		        String text = "We learn Java basics as part of java sessions in java week1";
		        
		        
		        int count;
		        
		       
		        String[] words = text.split(" ");
		        
		        System.out.println(Arrays.toString(words));
		        
		        // Step 3: Create nested for loops to compare each word
		        for (int i = 0; i < words.length; i++) {
		            count = 1;
		            for (int j = i + 1; j < words.length; j++) {
		                // Use equalsIgnoreCase for case-insensitive comparison
		                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
		                    // Step 4: Replace duplicate word with an empty string
		                    words[j] = " ";
		                    count++;
		                }
		            }
		           
		        }
		        
		      
		        System.out.print("Modified string: ");
		        for (String word : words) {
		            if (!word.equals("")) {
		                System.out.print(word + " ");
		            }
		        }
		    }
		}



