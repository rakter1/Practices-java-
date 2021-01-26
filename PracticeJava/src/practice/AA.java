package practice;

public class AA {
	// static always class level
	// Static fields/variable
	static int a = 10;
	// Instance variable
	int b = 15;

	// static method---1)
	public static void info() {
		System.out.println(a + b);
		System.out.println("I am static method");

	}

	// Non Static method
	public void abd() {
		System.out.println(a + b); // here we have static and non static variable
		System.out.println("I am NON-static method");
	
	}
	// Static Method

	// static method-----2)
		public static void defo() {
			System.out.println("I am Static method");
			info();
			abd();
		}
		// Non Static method
		public void cvc() {
			System.out.println(a + b); // here we have static and non static variable
			info(); // Calling static method 
			defo();  // Calling non static method 
			System.out.println("I am Non- static variable ");
		
		}	
		
	
}
