package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("karishma@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		
		driver.quit();
	}
}
