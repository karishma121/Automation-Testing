package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectIndex {
	public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	WebElement dropDown = driver.findElement(By.id("drop1"));
	dropDown.click();
	Select option = new Select(dropDown);
	//option.selectByIndex(1);
	
	for (int i = 0; i <= 4; i++) {
		option.selectByIndex(i);
}
}
}
