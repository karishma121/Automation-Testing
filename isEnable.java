package checkBoxesHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	public static void main(String[]args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		 WebElement radio = driver.findElement(By.id("femalerb"));
		 boolean active = radio.isEnabled();
		 System.out.println(active);
		 if(active==true) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 	
			 	
			 	js.executeScript("arguments[0].click();", radio);
		 }
		 
}
}
