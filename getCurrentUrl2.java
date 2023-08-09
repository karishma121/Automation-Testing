package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentUrl=driver.getCurrentUrl();
		
		String expectedUrl = "https://www.facebook.com/";
		
		driver.get("https://www.instagram.com/");
		
		String currentUrl2= driver.getCurrentUrl();
		System.out.println(currentUrl2);
	}
}