package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium dowload");
		
		WebElement searchButton = driver.findElement(By.className("gNO89b"));
		searchButton.click();
	}
}
