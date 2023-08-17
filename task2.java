package checkBoxesHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		
		//launch URL
		driver.get("https://semantic-ui.com/modules/checkbox.html");
		WebElement checkBox = driver.findElement(By.xpath("//div[@class='ui checkbox'][1]"));
		boolean visible = checkBox.isDisplayed(); 
		System.out.println(visible);
		if(visible==true) {
			checkBox.click();
		}
}
}
