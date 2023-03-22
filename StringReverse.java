package BasicJavaPrograms;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		
		String one ;
		String temp ="";                            // This is for store the reversed string. Temp variable
		 
		Scanner s = new Scanner(System.in);         //This is for getting a value from user Runtime input
		System.out.println("Please enter the String");
		one =s.next();
		
		for(int i=one.length()-1; i>=0; i--) {	/*why we are giving i =one.length()-1 means we need to take each char separatly and also
		 				                                  index value starts from 0 that's y we giving -1 for char value ex: length =4 index value is 0 - 3. 
		 										                      each time the loop will decreasing the char.*/
			temp =temp+one.charAt(i);
		}
		System.out.println(temp);
		
	}
}

// Input  : Codoid
// Output : diodoC
