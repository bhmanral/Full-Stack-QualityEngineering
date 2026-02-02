package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) throws Exception {

		/*
		  Prepare Test script to launch Facbook website, maximize and close
		                 application in IE Browser
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.close();

	}

}
