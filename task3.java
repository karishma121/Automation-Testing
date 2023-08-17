package checkBoxesHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
 public static void main(String[]args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	 List<WebElement> box = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
	 int a=box.size();
	 System.out.println(a);
	 
	 for(int i=0;i<box.size();i++) {
	
		 	Thread.sleep(2000);
		 	
		 	JavascriptExecutor js=(JavascriptExecutor)driver;
		 	
		 	
		 	js.executeScript("arguments[0].click();", box.get(i));
		 	
			//	box.get(i).click();
			}
	}
	 
 }
