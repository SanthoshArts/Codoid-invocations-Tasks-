package BasicJavaPrograms;

import java.util.Scanner;
public class Array_Comparition {
	public static void main(String[] args) {
		int size1, size2;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the first array size");
		size1 =s.nextInt();
									
		int arr1[] = new int[size1];		// This is for getting a first array size from user
		System.out.println("Please enter the first array values");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = s.nextInt();			// And we need to assign all values in corresponding index
		}
		
		System.out.println("please enter the second array size");
		size2 =s.nextInt();
									
		int arr2[] = new int[size2];		// This is for getting a second array size from user
		System.out.println("Please enter the second array values");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = s.nextInt();			// And we need to assign all values in corresponding index
		}
	
		for(int i=0;i<arr1.length;i++) {		// This loop is for iterating first array values
			for(int j=0;j<arr2.length;j++) {	// This loop is for iterating second array values
				if(arr1[i]==arr2[j]) {			// This is for compare the two array values
					System.out.print(arr1[i]+" ");
			}
		}
	}
	}

}
