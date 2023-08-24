package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement doubleClick1 = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		Actions click = new Actions(driver);
		click.doubleClick(doubleClick1).perform();
	}
}
