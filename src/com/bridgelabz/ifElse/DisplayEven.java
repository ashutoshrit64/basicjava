package com.bridgelabz.ifElse;

import java.util.Scanner;

public class DisplayEven {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter number range:");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

}
