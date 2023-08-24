package actionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickAlert {

	public static void main(String[]args) {

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://artoftesting.com/samplesiteforselenium");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.id("dblClkBtn"));
		 
		 Actions click = new Actions(driver);
		click.doubleClick(button).perform();
		 
		 Alert popup = driver.switchTo().alert();
		 String text1 = popup.getText();
		 System.out.println(text1);
		 
		 popup.accept();

		 
	}
}
