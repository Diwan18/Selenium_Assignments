package week3.day2;

public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String GivenString  = "changeme";	        
		        
		        char[] charArray = GivenString.toCharArray();
		        
		        System.out.println(charArray.length);
		  
		        for (int i = 0; i < charArray.length; i++) {
		            
		            if (i % 2 != 0) {		                
		                charArray[i] = Character.toUpperCase(charArray[i]);
		            }
		        }
		        String result = new String(charArray);
		        System.out.println("Modified string: " + result);
		    }
		}


	
