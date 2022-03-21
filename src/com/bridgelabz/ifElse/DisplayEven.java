package com.bridgelabz.ifElse;

import java.util.Scanner;

public class DisplayEven {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter number range:");
		int number=scanner.nextInt();
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the date:");
		int date=scan.nextInt();
		switch(date) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("please enter proper day!!");
			break;
		}
		for(int i=0;i<number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
