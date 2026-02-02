package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links are: " +linkcount.size());
		
		for(int i=0 ; i<linkcount.size(); i++)
		{
			System.out.println(linkcount.get(i).getText());
			// To print all the links name in the Web Application
		}
		
// WAP to prepare a test script to call the number of links and print the link name starts with 'M' or 'm'
		
		for(int i=0 ; i<linkcount.size(); i++)
		{
			String str = linkcount.get(i).getText();
			if(str.startsWith("M") || str.startsWith("m") )
					{
				System.out.println(str);
					}
			
		}
		
		driver.close();

	}

}
