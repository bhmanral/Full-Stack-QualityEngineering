package oops;

class GrandParents {

	public void GLand() {
		System.out.println("This is GrandParent's Land");
	}
}

class Parents extends GrandParents {

	public void PLand() {
		System.out.println("This is Parent's Land");
	}
}

public class Children extends Parents {

	public void CLand() {
		System.out.println("This is Child's Land");
	}

	public static void main(String[] args) {

		GrandParents g = new GrandParents();
		g.GLand();

		Parents p = new Parents();
		p.PLand();
		p.GLand();

		Children c = new Children();
		c.CLand();
		c.PLand();
		c.GLand();

	}

}
