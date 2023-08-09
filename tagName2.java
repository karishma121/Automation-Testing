package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName2 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("karishma@gmail.com");
		
		
		driver.findElement(By.name("pass")).sendKeys("12345");
	
		
		driver.findElement(By.tagName("button")).click();
		
		
	}
}

