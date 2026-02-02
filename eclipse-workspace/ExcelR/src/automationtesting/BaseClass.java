package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;

	//Creating Method to launch the application
	public void LaunchApp(String URL) {

		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		driver = new ChromeDriver();
		driver.get(URL);

		driver.manage().window().maximize();
	}

	//Creating Method to close the application
	public void CloseApp() {
		
		driver.close();
	}

}
