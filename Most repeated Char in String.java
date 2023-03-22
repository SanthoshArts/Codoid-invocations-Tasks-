package BasicJavaPrograms;
import java.util.Scanner;
public class maximumRepeatedCharacter {
	public static void main(String[] args) {
		String name;
		Scanner s = new Scanner(System.in);                  // This Scanner is for getting value from user 
		System.out.println("Pleasse enter the string value");
		name =s.nextLine();
		char[] a =name.toCharArray();	                     // This is convering the string to CharArray 
		int freq[] = new int[a.length];	                     // Temporary Array for Storing
		for(int i=0; i<a.length; i++) {
			if(a[i]!=' ') {                                 // This condition is for ignore the spasses  
				int num =a[i];
				int count =1;
				for(int j=i+1; j<a.length; j++) {
					if(num == a[j]) {		            // if the corresponding two Char are same then it will increase the count value
						count++;
						freq[j] = -1;		           // after increasing count we need to change the current value as -1 
					}
				}
				if(freq[i]!=-1) {	         // This is for inserting the count of char in freq array. but we need to insert which is not -1 value
					freq[i] =count;
				}
			}
		}
		int max =0, position =0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>max) {			            // this condition is for find the most repeated char in the given string		
				max = freq[i];			           // we need to replace the big value in max. now max having the most repeated char count.
				position =i;
			}
		}
		System.out.println(a[position]+" occures "+max+" times");	    // then we need to print that count 
	}
}
/*      
    Input  : SANTHOSH SARAVANAN
    Output : A occurs 5 times
*/
