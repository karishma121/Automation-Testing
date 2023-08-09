package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byId {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("karishma@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("123456");
	}
	
}

