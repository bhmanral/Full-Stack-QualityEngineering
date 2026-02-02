package javaProgram;

import java.util.*;

public class RandomFact {

	public static void main(String[] args) {
		// Factorial of a number enter by user choice

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for the factorial \t");

		int a = sc.nextInt();

		int num = a;

		int fact = 1;

		while (a != 1) {
			fact = fact * a;
			a--;
		}
		sc.close();
		
		System.out.println("Factorial of " + num + " is " + fact);

	}

}
