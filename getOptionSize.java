package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionSize {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement option = driver.findElement(By.id("multiselect1"));
		Select a = new Select(option);
		List <WebElement> opt = a.getOptions();
		System.out.println(opt.size());
		int opt1 = opt.size();
		
		for (int i=0;i<opt1;i++) {
			a.deselectByIndex(i);
			
			WebElement element = opt.get(i);
			
			String value = element.getText();
			
			System.out.println(value);
			}
		
		/*a.deselectByIndex(1);
		a.deselectByValue("audix");
		a.deselectByVisibleText("Volvo");*/
	}
}
