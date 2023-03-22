package BasicJavaPrograms;

import java.util.Scanner;

public class find_Odd_Or_EvenNumber {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		number = s.nextInt();
											
		if(number%2==0)										                	       // This is the condition for checking the number is odd or even
															                        	      // %2 will gives the remainder value of that number 
			System.out.println(number+" This is Even number");
		else
			System.out.println(number+" This is Odd number");
	}

}
/* 
  Input : 10 
  Output: 10 This is Even number
  
  Input  : 5
  Output : 5 This is Odd number
*/
