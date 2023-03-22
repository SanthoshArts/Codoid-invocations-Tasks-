package BasicJavaPrograms;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String word;
		String rev ="";		// This is for store the reversed string. Temp variable
		
		Scanner s = new Scanner(System.in);	 // Getting a value for user User input 
		System.out.println("Enter the String or number");
		word=s.nextLine();
		
		for(int i=word.length()-1; i>=0; i--) {	/*why we are giving i =one.length()-1 means we need to take each char separately and also
			  									 	index value starts from 0 that's y we giving -1 for char value ex: length =4 index value is 0 - 3. 
			  										each time the loop will decreasing the char.*/
			rev = rev+word.charAt(i);
		}
		if(rev.equals(word)) 			   // This is for checking the two strings are equal or not
			System.out.println("This is palindrome");
		
		else
			System.out.println("This is not a palindrome");
	}
}

/* 	Input : MADAM
   	Output : This is palindrome
   
	Input : Codoid
	Output : This is not a palindrome	 
*/
