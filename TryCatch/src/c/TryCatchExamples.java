package c;

import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {
		
//		try {
//			int[] a = {4, 5, 1};
//		System.out.println(a[0]);
//
//		} catch(Exception e) {
//			System.out.println("an exception happened");
//		}
//=============================================================
//		Scanner scan = new Scanner(System.in);
//		System.out.println("What is your fav number?");
//		
//		try {
//			int n = scan.nextInt();
//		System.out.println(n);
//		
//		} catch(Exception e) {
//			System.out.println("Sorry, Please enter a number");
//		}
//==============================================================
		try {
			int[] a = {4};
		System.out.println(a[1]);
		} catch(NullPointerException e) {
			System.out.println("Your Array is NULL");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your Array index is out of bounds");
		} catch(Exception e) {
			System.out.println("Something else went wrong");
		}
		
		
		
		
	}

}
