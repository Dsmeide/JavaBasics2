package c;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
//		int day = 6;
//		
//		if(day == 1) {
//			System.out.println("Sunday");
//		} else if (day == 2) {
//			System.out.println("Monday");
//		} else if (day == 3) {
//			System.out.println("Tuesday");
//		} else if (day == 4) {
//			System.out.println("Wednesday");
//		} else if (day == 5) {
//			System.out.println("Thursday");
//		} else if (day == 6) {
//			System.out.println("Friday");
//		} else if (day == 7) {
//			System.out.println("Saturday");
//		}

//		int day = 4;
//		switch(day) {
//			case 1:
//				System.out.println("Sunday");
//				break;
//			case 2:
//				System.out.println("Monday");
//				break;
//			case 3: 
//				System.out.println("Tuesday");
//				break;
//			case 4: 
//				System.out.println("Wednesday");
//				break;
//			case 5:
//				System.out.println("Thursday");
//				break;
//			case 6:
//				System.out.println("Friday");
//			case 7:
//				System.out.println("Saturday");
//			default:
//				System.out.println("none");
//				
//		}
//		String dogColor = "Great Dane";
//		switch(dogColor) {
//			case "Heeler": 
//				System.out.println("Red");
//				break;
//			case "Dalmation":
//				System.out.println("White and black spots");
//				break;
//			case "Great Dane":
//				System.out.println("Brown");
//				break;
//				
//		}
		System.out.println("Enter a color to find out which dog breeds are that color:");
		Scanner scan = new Scanner(System.in);
		
		String dogColor = scan.nextLine();
		dogColor = dogColor.toLowerCase();
		
		switch(dogColor) {
			case "red":
				System.out.println("Red Heeler");
				break;
			case "blue":
				System.out.println("Blue Heeler");
				break;
			case "brown":
				System.out.println("Terrior, Lab, Great Dane, Weener");
				break;
			case "white":
				System.out.println("Poodle, Shitzu, Wolf");
				break;
			case "black":
				System.out.println("Lab, Great Dane");
				break;
			case "gold":
				System.out.println("Golden Lab, Golden Doodle");
				break;
			default:
				System.out.println("No dogs are that color");
		
		}
		
	}

}
