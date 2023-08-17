package AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleGetText1 {

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 WebElement alert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		 alert.click();
		 Thread.sleep(5000);
		 Alert text = driver.switchTo().alert();
		 String text1 = text.getText();
		 System.out.println(text1);
		Thread.sleep(2000);
		 text.accept();

	}
}
