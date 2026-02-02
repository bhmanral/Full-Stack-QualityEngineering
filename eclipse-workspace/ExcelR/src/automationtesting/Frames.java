package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.List;

public class Frames {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		driver.manage().window().maximize();
		
		
//Created WebElement for frame
		
		WebElement f1 = driver.findElement(By.name("packageListFrame"));
		
		
//Switch focus to frame and click an element in the frame
		
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/awt/package-frame.html']")).click();
		Thread.sleep(3000);
		
		
		
		driver.close();

	}

}
