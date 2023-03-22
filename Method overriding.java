class instagram1{
	public void version() {
		System.out.println("This is the first Version of instagram");
	}
}
class instagram2 extends instagram1{ 	        //instagram2 extends the instagram1 Features
	public void version() {
		System.out.println("This is the second Version of instagram");
	}
}
class instagram3 extends instagram2{	    /*instagram3 extends the instagram2 Features. so it has the features of instagram1 & instagram2. instagram3 overrides 
										                         the previous all versions. when we call the version method always it will give the current version only */
	public void version() {
		System.out.println("This is the Latest current Version of instagram");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
	instagram3 I = new instagram3();	          // creating the object for instaram3 class
	I.version();					                    	// Call the method name
	}

}
// Method Overriding : In a same method name same parameter in a inherated classes 
// Output: This is the Latest current Version of instagram
