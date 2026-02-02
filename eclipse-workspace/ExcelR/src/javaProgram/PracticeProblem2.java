package javaProgram;

public class PracticeProblem2 {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 4567";

		/*
		 * 1. Length of A variable should be greater than length of B and should be less
		 * than C variable
		 */

		if ((a.length() > b.length()) == true && (a.length() < c.length()) == true)
			System.out.println(true);
		else
			System.out.println(false);

		/*
		 * 2. Concatenate A and B variables and verify length should be less than C
		 * variable length or greater than 5
		 */

		String conc = a.concat(b);

		if ((conc.length() < c.length()) == true || conc.length() > 5)
			System.out.println(true);
		else
			System.out.println(false);

		/*
		 * 3. A variable should starts with "ab" and B variable should not ends with
		 * "yz"
		 */

		if (a.startsWith("ab") == true && b.endsWith("yz") == false)
			System.out.println(true);
		else
			System.out.println(false);

		/* 4. C variable should contains space and should not contains 9 */

		if (c.contains(" ") == true && c.contains("9") != true)
			System.out.println(true);
		else
			System.out.println(false);

		/*
		 * 5. 7th position in a C variable should be y or z and k should be available in
		 * the either 10th or 11th position
		 */

		if ((c.charAt(7) == 'y' || c.charAt(7) == 'z') && (c.charAt(10) == 'k' || c.charAt(11) == 'k'))
			System.out.println(true);
		else
			System.out.println(false);

		/*
		 * 6. Split C variable into multiple strings with " "(space) and verify length
		 * of the array should be 4 or 5
		 */

		String[] arr = c.split(" ");

		if ((arr.length == 4 || arr.length == 5) == true)
			System.out.println(true);
		else
			System.out.println(false);

		/*
		 * Verify first string of the C variable should be same as A variable and should
		 * not be same as 3rd string of the C variable
		 */

		String arr1 = c.substring(0, c.indexOf(" "));

		String arr2 = c.split(" ")[2];

		if (a.equals(arr1) && !arr1.equals(arr2))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
