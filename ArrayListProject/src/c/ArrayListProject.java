package c;

import java.util.ArrayList;

public class ArrayListProject {

	public static void main(String[] args) {
		
		//ArrayLists are more versitile than arrays.  with arrays you need to know the exact size. arraylist is easy to change
		
//		String[] fruits = new String[3];
//		fruits[0] = "Mango";
//		fruits[1] = "Apple";
//		fruits[2] = "Strawberry";
//		System.out.println(fruits[1]);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		
		fruitList.remove("Strawberry");
		System.out.println((fruitList.contains("raspberry")));
		System.out.println(fruitList);
		
		
	}

}
