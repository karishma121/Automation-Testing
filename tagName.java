package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String username = driver.findElement(By.id("email")).getTagName();
		System.out.println("Tag Name for user name is ="+username);
		String passsword = driver.findElement(By.id("pass")).getTagName();
		System.out.println("Tag Name for password is ="+passsword);
	}

}
