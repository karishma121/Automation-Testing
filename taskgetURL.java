package windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskgetURL {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement URL = driver.findElement(By.partialLinkText("http://www.Selenium143.blogspot.com"));
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		URL.click();
		//driver.get("http://selenium143.blogspot.com/");
		String currentURL2 = driver.getCurrentUrl();
		System.out.println(currentURL2);
		
		
}
}
