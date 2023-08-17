package checkBoxesHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleCheckBox {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		
		//launch URL
		driver.get("http://omayo.blogspot.com/");
		
		// store in webElement which is checkbox 
		
		WebElement checkBox = driver.findElement(By.name("accessories"));
		
		//to check check box button selected or not
		boolean check1 = checkBox.isSelected();
		System.out.println(check1); 
		
		//if selected click on that check box
		if (check1==false) {
			checkBox.click();
		}
		
	}
	
}
