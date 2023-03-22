package BasicJavaPrograms;
import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[] args) {
	int a,b;
	Scanner s = new Scanner(System.in);
	System.our.println("Enter the first value");
	a=s.nextInt();
	System.our.println("Enter the second value");
	b=s.nextInt();

	System.out.println("before swapping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	a=a+b;                              
	b=a-b;
	a=a-b;
	System.out.println("after swapping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
     }
}
/* This is the concept of swaping numbers let us take a=50 b=30. 
              a = a+b => 50+30= 80
              b = a-b => 80-30 = 50
              a = a-b => 30-50 = 30*/

// Input  : a=50, b=30
// Output : a=30, b=50
