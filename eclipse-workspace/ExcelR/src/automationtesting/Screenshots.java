package automationtesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws Exception {

		BaseClass bc = new BaseClass();

		bc.LaunchApp("https://www.facebook.com/");

		Thread.sleep(2000);
		
		WebElement drive = bc.driver.findElement(By.name("login"));
		
		File f = (drive.getScreenshotAs(OutputType.FILE));
		
		Files.copy(f, new File("/Users/bhmanral/Desktop/Output/"+ bc.driver.getTitle() +".png"));

		bc.CloseApp();

	}

}
