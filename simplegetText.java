package AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplegetText {

	public static void main(String[]args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.id("alert1"));
		 button.click();
		 Alert message = driver.switchTo().alert();
		// String msg = getText();
		// System.out.println(msg);
	
}
}
