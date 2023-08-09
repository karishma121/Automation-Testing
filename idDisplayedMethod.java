package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idDisplayedMethod {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean String = driver.findElement(By.name("login")).isDisplayed();
		System.out.println(String);
		
		if (String) {
			System.out.println("Test case pass");
		}
		else {
			
			System.out.println("Test case fail");
		}
		
		
	}
}
