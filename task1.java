package mouseOver;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task1 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 WebElement component = driver.findElement(By.partialLinkText("Components"));
		 Actions action = new Actions(driver);
		 action.moveToElement(component).perform();
		 
		
		 driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
		 
		 java.util.List<WebElement> priceBox = driver.findElements(By.xpath("//span[@class='price-new']"));
		 
		 int count = priceBox.size();
		 System.out.println("Total count of result is= " +count);
}
}
