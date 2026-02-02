package automationtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
	

		
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		
		System.out.println(a.getText());

//Closing the Alert
		
		a.dismiss();
		Thread.sleep(1500);
		
		driver.close();
		

	}

}
