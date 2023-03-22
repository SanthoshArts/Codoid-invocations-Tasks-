package BasicJavaPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates_GivenArrray {
	public static void main(String[] args) {
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the array size");
		size =s.nextInt();
									
		int arr[] = new int[size];	// This is for getting a array size from user
		System.out.println("Please enter the array values");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();	// And we need to assign all values in corresponding index
		}
		Arrays.sort(arr);		// This is for sort the array in ascending order
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {		/*This condition is for if first value != second value we need to keep that values.
			 							  if it is equals ignore the first value*/
				arr[j] = arr[i];		// After that we need to assign that value to arr[j]
				j++;					// after assigning we need to increment the j value j++
			}
		}
		arr[j] =arr[arr.length-1];		// After completion of loop array last values is there so we need to assign the last value to current j index 
		for(int i=0; i<j;i++) {
			System.out.println(arr[i]+ " ");	// after that we need to print the value to j index only this is only have the values without repeat
		}
	}	
}
// Input  : {12,10,12,10,35,56,7,87,7}
// Output : {7,10,12,35,56,87}
