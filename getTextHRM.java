package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextHRM {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean String = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(String);*/
		
		WebElement userName = driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		  
		WebElement pass = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
		login.click();
	}
}
