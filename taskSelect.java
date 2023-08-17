package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class taskSelect {
public static void main(String[]args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement option = driver.findElement(By.xpath("//select[@multiple='true']"));
	
	Select a = new Select(option);
	
	// to check is multiselect or not 
	if (a.isMultiple()) {
		List<WebElement>optionBox = a.getOptions();
	
		//Select all option 
		for(int i = 0; i < optionBox.size();i++) {
			a.selectByIndex(i);
			
		}
		
		//2nd option deselect
		a.deselectByIndex(1);
		
		//2nd deselect option text 
		String deselectText = optionBox.get(1).getText();
		System.out.println(deselectText);
	}
	
}
}
	
	
	
