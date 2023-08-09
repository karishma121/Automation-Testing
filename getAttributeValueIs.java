package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValueIs {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String username = driver.findElement(By.id("email")).getAttribute("id");
		System.out.println("Attribute name id value is ="+username);
		String passsword = driver.findElement(By.id("pass")).getAttribute("id");
		System.out.println("Attributr name id vallue is ="+passsword);
	}
}
