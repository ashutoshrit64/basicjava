package com.bridgelabz.ifElse;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter candidte age:");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.print("Candidate can give vote");
		}else {
			System.out.print("candidate should complete 18 years");
		}
		scan.close();
		

	}

}
