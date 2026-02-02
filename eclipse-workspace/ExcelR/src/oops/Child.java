package oops;

class Parent{
	
	public void Land() {
		System.out.println("This is Father's Land");
	}
}

public class Child extends Parent{
	
	public void CLand() {
		System.out.println("This is Child's Land");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.CLand(); c.Land();
		
		Parent p = new Parent();
		p.Land();
	}

}
