package c;

public class BreakStatements {

	public static void main(String[] args) {
		
		// break; exit the {} of the INNER MOST LOOP it is in.  Must be in a loop
		
//		while(true) {
//			System.out.println("hi");
//			break;
//		}
		
//		int[] numbers = {10, 20, 30, 40, 50};
//		
//		for(int i = 0; i < numbers.length; i++) {
//			
//			if (numbers[i] == 30) {
//				break;
//			}
//			System.out.println(numbers[i]);
//			
//		}
		
		// switch statement is a glorified if else statement
		
//		int i = 10;
//		switch(i) {
//			case 0:
//				System.out.println("Zero!");
//				break;
//			case 1:
//				System.out.println("One!");
//				break;
//			default:
//				System.out.println("WTF MAN??");
//				break;
//		}
		
		// break statement in nested loops
		// example of a break statement in a nested for loop
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println(i + ", " + j);
				break;
			}
		}
		
		
		
	}

}
