package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement option = driver.findElement(By.id("drop1"));
		option.click();
		Select a = new Select(option);
		boolean value = a.isMultiple();
		System.out.println(value);
		
}
}
