package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector2 {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.olx.in/en-in");
		driver.findElement(By.cssSelector("input._1dasd")).click();
		driver.close();
	}

}
