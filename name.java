package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kgfhkgfhk");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("kjgkhk");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
		
	}
}

