package actionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class task {

	public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	 driver.manage().window().maximize();
	 WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	 
	 Actions act = new Actions(driver);
	 act.contextClick(button).perform();
	 
	 List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
	
		
		int opt1 = options.size();
		
		
	 for (int i=0;i<opt1;i++) {
			
			WebElement element = options.get(i);
			
			String value = element.getText();
			
			System.out.println(value);
			
			if(value.equals("Edit")){
				
				
				Actions a2 = new Actions(driver);
				a2.click(element).perform();

				//Alert action = driver.switchTo().alert();
				//action.accept();
			
			}
	
			}
	 
	 
	 	
	}
}
