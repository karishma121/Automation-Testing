package windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is ="+parentId);
		WebElement a1 = driver.findElement(By.id("tabButton"));
		a1.click();
		
		WebElement Text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String Text2 = Text.getText();
		Thread.sleep(1000);
		System.out.println(Text2);
	}

}
