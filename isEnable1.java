package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable1 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		boolean String = driver.findElement(By.id("but2")).isEnabled();
		System.out.println(String);
		
		if (String) {
			System.out.println("Test case pass");
		}
		else {
			
			System.out.println("Test case fail");
		}
		
		
	}
}
