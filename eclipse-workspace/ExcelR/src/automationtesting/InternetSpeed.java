package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fast.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(13000);
		
		WebElement speed = driver.findElement(By.id("speed-value"));
		WebElement speedUnit = driver.findElement(By.id("speed-units"));
		
		System.out.println("The speed is "+ speed.getText() + speedUnit.getText());
		
		driver.close();
	}

}
