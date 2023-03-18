package BasicJavaPrograms;
import java.util.Scanner;
public class patternProgram {
	public static void main(String[] args) {
		int n;
		Scanner  s = new Scanner (System.in);							// This Scanner is for getting a value from user
		System.out.println("Please enter the numeric value");
		n =s.nextInt();
		outerloop:							/*This lables is for identifying the loops name & moving to inner to outer loops*/  
		for(int i=1; i<=n; i++) {
			innerloop:
			for(int j=1; j<=i;j++) {
				if(i==3) 						// if condition is for skip the current iteration 
				continue outerloop;	     	/*continue is for when i==3 it will skip the current inner loop and will go to executing the 
					 					      	 * next outer loop (i==4)*/	 
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

/*
	Output
  *
  * *
  * * * *
  * * * * *
  * * * * * *     */
