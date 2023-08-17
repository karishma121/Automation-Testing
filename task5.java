package checkBoxesHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {

	public static void main(String[]args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.goibibo.com/");
		 driver.manage().window().maximize();
		 
		 WebElement popup = driver.findElement(By.xpath("//span[@role='presentation']")) ;
			
			popup.click();
			
		 List<WebElement> buttons = driver.findElements(By.xpath("//ul[@class='sc-12foipm-8 eRImZh']/li"));
		 
		 int size = buttons.size();
		 System.out.println(size);
		 for(int i=0;i<buttons.size();i++) {
			 buttons.get(i).click();
			 Thread.sleep(2000);
		 }
		 	 
}
}
