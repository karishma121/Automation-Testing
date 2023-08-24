package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick2 {

	public static void main(String[]args) {

		 WebDriver driver = new ChromeDriver();
		 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		 driver.manage().window().maximize();
		 WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		 Actions act = new Actions(driver);
		 act.contextClick(button).perform();
	
		 WebElement editBtn = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit context-menu-visible']"));
		 editBtn.click();
}
}
