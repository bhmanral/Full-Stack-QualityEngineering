package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) throws Exception {
		
/*To open Sign up page of Facebook and enter First name, Last name and New password*/
		
		System.setProperty("webdriver.chrome.driver" , "/Users/bhmanral/selenium-java-4.34.0/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Bhawna");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Thareja");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123451");
		Thread.sleep(2000);
		
		driver.close();


	}

}
