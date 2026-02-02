package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyLoc {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("bhawna@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("bh123");
		Thread.sleep(2000);
		
		// driver.findElement(By.id("loginbutton")).click();
		//It will throw the exception because the id value keeps changing 
		// So, instead of id we will use class as the locator
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		//driver.close();
		
	}

}
