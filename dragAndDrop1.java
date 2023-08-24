package mouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop1 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement pickup = driver.findElement(By.id("box2"));
		WebElement drop = driver.findElement(By.id("box102"));
		Actions act = new Actions(driver);
		act.dragAndDrop(pickup, drop).perform();
}
}
