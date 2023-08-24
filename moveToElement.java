package mouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 WebElement lang = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(lang).perform();
}
}
