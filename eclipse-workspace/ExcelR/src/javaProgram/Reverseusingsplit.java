package javaProgram;

public class Reverseusingsplit {

	public static void main(String[] args) {

		String a = "Bhawna QA";

		String[] arr = a.split(" "); // using split method

		for (int i = arr.length - 1; i >= 0; i--) // reversing the string
			System.out.print(arr[i] + " ");

	}

}

// Length starts from 1 and index starts from 0