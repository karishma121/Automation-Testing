package webElementsCommands;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		org.openqa.selenium.Dimension d = email.getSize();
		
		int width = d.getWidth();
		System.out.println("User name text width is ="+width);
		
		int height = d.getHeight();
		System.out.println("User name text height is ="+height);
		
	}

}
