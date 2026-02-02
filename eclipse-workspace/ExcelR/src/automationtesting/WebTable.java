package automationtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static void main(String[] args) throws Exception {

		BaseClass bc = new BaseClass();
		bc.LaunchApp("https://money.rediff.com/sectors/bse/bankex");

		Thread.sleep(2000);

		WebElement check = bc.driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));

// For number of Rows

		List<WebElement> DataRow = check.findElements(By.tagName("tr"));
		System.out.println("Number of Rows are: " + (DataRow.size()-1));

// For number of Columns	

		List<WebElement> DataCol = check.findElements(By.tagName("th"));
		System.out.println("Number of Columns are: " + DataCol.size());

// For number of Data
		
		List<WebElement> Data = check.findElements(By.tagName("td"));
		System.out.println("Number of Datas are: " + Data.size());

// To print the data of the first column in the table 
		
		List<WebElement> links = check.findElements(By.tagName("a"));

		for (WebElement index : links) {
		    System.out.println(index.getText());
		}
		
		bc.CloseApp();

	}

}
