package ArrayConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList L = new ArrayList();

		L.add("Aadi");
		L.add(32);
		L.add("School");
		L.add(23.65);
		L.add(true);

		System.out.println(L);

		Scanner sc = new Scanner(System.in);

		ArrayList<String> name = new ArrayList<String>();

		System.out.println("Enter the 2 names");

		for (int i = 0; i < 2; i++) {
			String n = sc.nextLine();
			name.add(n);
		}

		sc.close();
		
		System.out.println(name + " ");
		
	}

}
