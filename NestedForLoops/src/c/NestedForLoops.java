package c;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("its so freaking cold outside");
		}
		
		System.out.println("---------------------");
		
		String[] colors = {"Red", "Blue", "Green"};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(colors[i]);

		}
		
		System.out.println("-------------");
		//2D array
		String[][] fancyColors = {
				{"Red", "Blue", "Green"}, 
	            {"Cyan", "Magenta", "Turquoise"}
		}; 
		
		for(int row = 0; row < 2; row++) { // for loops for ROWS only two Rows
			for(int columb = 0; columb < 3; columb++) { // nested for loops for COLUMBS of each row only 3 Columbs
				System.out.println(fancyColors[row][columb]); //easy way to remember which comes first, rows or columbs and ARRAY starts with a ROW
			}
			
		System.out.println("-----------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
		}
		}
			
	}

}
