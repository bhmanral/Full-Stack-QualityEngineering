package oops;


class Father {

	public void fLand() {
		System.out.println("This is Parent's Land");
	}
}

class Child1 extends Father {

	public void C1Land() {
		System.out.println("This is First Child's Land");
	}
}

public class Child2 extends Father {

	public void C2Land() {
		System.out.println("This is Second Child's Land");
	}

	public static void main(String[] args) {

		Father f = new Father();
		f.fLand();
		
		Child1 C1 = new Child1();
		C1.C1Land();
		C1.fLand();
		
		Child2 C2 = new Child2();
		C2.C2Land();



	}

}
