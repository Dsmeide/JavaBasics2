package c;

import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args) {
		
		//exception interrupts the normal flow of code
		
		//String[] pets = {"dog", "cat", "monkey"};
		//pets 3 doesn't exist
		//System.out.println(pets[3]);
		exceptionArrList();
		
		
	}
	public static void exception() {
		//int i = "alex";
		
	}
	public static void exceptionArrList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("book");
		System.out.println(list.get(0));
	}
	
}
