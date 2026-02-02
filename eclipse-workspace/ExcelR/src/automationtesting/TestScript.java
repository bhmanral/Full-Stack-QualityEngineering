package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws Exception {

/*Example: Prepare the test script for the below test case

Sl.No.      	 Description                                	Expected result
1.	        Launch Facebook App	                 Application title length should be greater than application URL length
2.	        Click on the Log In button	         Log In button should be available and should be enabled
3.	        Click on Forgot Password link	     Title of the page should not contain “password1”
4.	        Verify the Search Button	         Search Button should be available, and it should be enabled*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhmanral/selenium-java-4.34.0/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		// First Test Script
		String str1 = driver.getCurrentUrl();
		int count1 = str1.length();
		
		String str2 = driver.getTitle();
		int count2 = str2.length();
		
		if(count2 > count1)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		Thread.sleep(5000);
		
		
		//Second Test Script
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		Boolean b1 = driver.findElement(By.name("login")).isEnabled();
		Boolean b2 = driver.findElement(By.name("login")).isDisplayed();
		
		if((b2 && b1) == true)
			System.out.println("LOGIN BUTTON IS AVAILABLE AND ENABLED");
		else
			System.out.println("LOGIN BUTTON IS NOT AVAILABLE AND ENABLED");
		
		Thread.sleep(5000);
		
		
		//Third Test Script
		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(5000);
		
		String check = driver.getTitle();
		
		if(check.contains("password1") == true )
			System.out.println("It contains password1");
		else
			System.out.println("It do not contains password1");
		
		Thread.sleep(5000);
		
		
		//Fourth Test Script
		Boolean dis = driver.findElement(By.name("did_submit")).isDisplayed();
		Boolean enab = driver.findElement(By.name("did_submit")).isEnabled();
		
		if((dis && enab) == true)
			System.out.println("Search BUTTON IS AVAILABLE AND ENABLED");
		else
			System.out.println("Search BUTTON IS NOT AVAILABLE AND ENABLED");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
