package oops;

abstract class Firstrelease {

	public void classroom() {
		System.out.println("Class Room training is started");
	}

	public abstract void online(); // Abstract Method

	public abstract void corporate(); // Abstract Method
}

abstract class Secondrelease extends Firstrelease {

	@Override
	public void online() {
		System.out.println("Online training is started");
	}

}

public class Finalrelease extends Secondrelease {

	@Override
	public void corporate() {
		System.out.println("Corporate training is started");
	}

	public static void main(String[] args) {
		Finalrelease fr = new Finalrelease();
		fr.classroom();
		fr.online();
		fr.corporate();
	}

}
