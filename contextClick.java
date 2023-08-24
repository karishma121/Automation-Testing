package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {

	public static void main(String[]args) {

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://artoftesting.com/samplesiteforselenium");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.id("idOfButton"));
		 
		 Actions act = new Actions(driver);
		 act.contextClick(button).perform();
	
}
}
