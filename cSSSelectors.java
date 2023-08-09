package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cSSSelectors {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("karishama");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("karishama121");
		driver.findElement(By.name("login")).click();
	}

}
