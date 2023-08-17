package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		drop.click();
		Select option = new Select(drop);
		
		
		for (int i = 0; i <= 4; i++) {
			option.selectByIndex(i++);
			System.out.println(i++);
	}
	}

}
