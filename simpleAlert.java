package AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {

	public static void main(String[]args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.id("alertBox"));
		 button.click();
		 Alert popup = driver.switchTo().alert();
		 popup.accept();
}
}
