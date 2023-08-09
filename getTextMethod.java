package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("karishma");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		
		String text = driver.findElement(By.xpath("//div[@class='_9nq2']")).getText();
		System.out.println(text);
}
}
