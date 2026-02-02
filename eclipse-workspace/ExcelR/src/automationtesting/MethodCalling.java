package automationtesting;

public class MethodCalling {

	public static void main(String[] args) throws Exception {
		
		BaseClass bc = new BaseClass();
		
		bc.LaunchApp("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		bc.CloseApp();

	}

}
