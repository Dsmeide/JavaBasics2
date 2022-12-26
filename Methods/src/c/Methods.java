package c;

public class Methods {

	public static void main(String[] args) {
		
		//System.out.prinln("Welcome to our calculator!");
		
		welcome();
		
		multiply(5, 10);
		
//		int a = 5;
//		int b = 10;
		
//		System.out.println(a * b);
		
		multiply(2, 4);
		
//		int c = 2;
//		int d = 4;
//		
//		System.out.println(c * d);
		
		multiply(9, 100);
		
//		int e = 9;
//		int f = 100;
//		
//		System.out.println(e * f);
		divide(20, 5);
		divide(100, 10);
		divide(9, 3);
		
		

	}
	
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void welcome() {
		System.out.println("Welcome to our calculator!");
	}
	
	public static void divide(int a, int b) {
		System.out.println(a / b);
	}
}
