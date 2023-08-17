package AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class promptAlert {

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		WebElement prompt = driver.findElement(By.xpath("//input[@id='prompt']"));
		prompt.click();
		Alert prompt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt1.sendKeys("KARISHMA");
}
}
