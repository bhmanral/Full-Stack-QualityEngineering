package javaProgram;

public class split {

	public static void main(String[] args) {
		
		String a = "Manral Java and Selenium";
		
		String[] arr = a.split(" "); //using split method
		
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
