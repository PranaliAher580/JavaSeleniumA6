package ProgramingA1;
import java.util.Arrays;
public class Anagram {
        public static void main(String[] args) {
			String s1="Silent";
			String s2="Listen";
			// Convert into LowerCase
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			// Convert String into Char Array
			
			char[] ch1=s1.toCharArray(); // Silent
			char[] ch2=s2.toCharArray(); // Listen
			 // Sort Both The Arrays.
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// Compare Both Char Array
			
			int count=0;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					count++;
				}
				else break;
				    
				}
			      System.out.println(count);
			  if (count==ch1.length) {
				    System.out.println(" Anagram"); 
				    }
			   
			  else {
			  
				  System.out.println(" Not An Anagram");
			  
			  
				  System.out.println("Not An Anagram");
				  }
			  
			  //=======================Way 2===========================//
			     // Converting Char Array TO String
			     s1=Arrays.toString(ch1);
			     s2=Arrays
			  
			  }
			
				
			
		}

