package keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class task {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		//WebElement password = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		Action xyz = act.moveToElement(email).click().sendKeys("Karishma")
		.doubleClick(email).
		keyDown(email,Keys.TAB).sendKeys("1234").keyDown(Keys.ENTER).build();
		xyz.perform();
		
}
}

