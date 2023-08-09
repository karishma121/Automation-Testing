package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("?")).click();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("http://www.Selenium143")).click();
		
	}
}
