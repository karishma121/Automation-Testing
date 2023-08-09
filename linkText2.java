package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText2 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();
	}
}
