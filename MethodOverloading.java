public class MethodOverloading {

	// Method overloading Changing datatypes and changing number of arguments

	static void value(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	static void value (int a) {
		System.out.println(a);
	}

	static void value(float a, double b) {
		System.out.println(a-b);
	}

	static void value(long a, float b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		value(10);
		value(10,20);
		value(33487l,20.2f);
		value(10.243f,30.5643);
		value(50,49,37);
	}
}
