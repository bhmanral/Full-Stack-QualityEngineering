package javaProgram;

public class PracticeProblem1 {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";

		/*
		 * 1. Verify length of A variable should be greater than length of C variable
		 * and should be less than B variable
		 */

		if ((a.length() > c.length()) && (a.length() < b.length()))
			System.out.println("True");
		else
			System.out.println("False");

		/* 2. A variable should not be same as B variable and C variable */

		if ((a.equals(c)) && (a.equals(b)))
			System.out.println("It is equal");
		else
			System.out.println(("It is not equal"));

		/* 3. C variable should not be same as A variable irrespective of the case */

		if (c.equalsIgnoreCase(a))
			System.out.println("It is equal");
		else
			System.out.println(("It is not equal"));

		/* 4. A variable should contains cd and should not contains xy */

		if (a.contains("cd") == true && a.contains("xy") == false)
			System.out.println("Pass");
		else
			System.out.println(("Fail"));

		/*
		 * 5. Convert B variable into UpperCase and verify it should contains "Z" and
		 * should not contains "z"
		 */

		if (b.toUpperCase().contains("Z") == true && b.toUpperCase().contains("z") == false)
			System.out.println("Pass");
		else
			System.out.println(("Fail"));

	}

}
