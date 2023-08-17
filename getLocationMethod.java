package webElementsCommands;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		org.openqa.selenium.Point p = email.getLocation();
		
		int x = p.getX();
		System.out.println("X axis is ="+x);
		
		int y = p.getY();
		System.out.println("Y axis is ="+y);
}
}
