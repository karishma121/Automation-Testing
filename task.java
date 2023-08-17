package checkBoxesHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		
		//launch URL
		driver.get("https://total-qa.com/checkbox-example/");
		
		// store webelement in list
		
		List<WebElement> checkBox1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//to check box size
		
			for(int i=0;i<checkBox1.size();i++) {
			
				//to check checkbox is selected or not 
				boolean check1 = checkBox1.get(i).isSelected();
			
				if(check1==false) {
					
					checkBox1.get(i).click();
				}
		}
			

		
		
	}
}
