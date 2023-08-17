package checkBoxesHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
public static void main(String[]args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.goibibo.com/");
	 driver.manage().window().maximize();
	 
	 //Thread.sleep(2000);
	 
	WebElement popup = driver.findElement(By.xpath("//span[@role='presentation']")) ;
	
	popup.click();
	 
	 WebElement radio = driver.findElement(By.xpath("//span[contains(text(),'senior citizen')]"));
	 boolean button = radio.isEnabled();
	 System.out.println(button);
	 if(button==true) {
		 radio.click();
	 }	 
}
}
