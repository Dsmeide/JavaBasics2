package package1;

import java.util.HashMap;

public class HashMapAwesomeness {

	public static void main(String[] args) {

		//variables are great at storing data
//		int a = 10;
//		String b = "hello";
//		int[] c = {1, 2, 4};
		
//=============================================
		
//		int a = 10;
//		int b = 3;
//		int c = 88;
//		
//		HashMap<String, Integer> happy = new HashMap<String, Integer>();
//		happy.put("a", 10);
//		happy.put("b", 3);
//		happy.put("c", 88);
//
//		System.out.println(happy);
//		System.out.println(happy.get("c"));
//===========================================================
		//username and password hashmap
		// key on left, value on right
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("bobbyJoe1996", "FluffyP0nies!");
		fun.put("helloKittyFan21", "AloeVera?");
		fun.put("coolguyswag", "password123");
		
		
		
		System.out.println(fun.containsValue("password123"));
		System.out.println(fun.replace("bobbyJoe1996", "b3tt3rP@ssword!"));
		System.out.println(fun);
	}

}
