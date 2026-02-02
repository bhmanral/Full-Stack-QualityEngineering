package ArrayConcept;

import java.util.*;

public class Basics {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 6, 1, 4 };

		System.out.println(arr[2]);

		String[] name = new String[5];

		System.out.println("Length of the array is " + name.length);

		name[0] = "Anisha";
		name[1] = "Bhawna";
		name[2] = "Taarak";
		name[3] = "Manish";
		// name[4] = "Uttara";

		System.out.println("The name at arr[4] will be " + name[4]);
		System.out.println(name[3]);
		System.out.println(name.length);

		// name[5] = "Saloni";

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at ArrayConcept.Basics.main(Basics.java:22)
		 */

		System.out.println("Enter the five numbers");

		Scanner sc = new Scanner(System.in);

		int[] number = new int[5];

		for (int i = 0; i < 5; i++) {
			number[i] = sc.nextInt();
		}
		
		System.out.println(number[3]);
		
		//For printing the array
		
		for(int data : number)
		{
			System.out.print("The numbers are " +data+ " ");
		}
		
		sc.close();
	}

}
