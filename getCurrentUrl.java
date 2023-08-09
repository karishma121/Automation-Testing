package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String currentUrl=driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		
		if (currentUrl.equals(expectedUrl)) {
			System.out.println("test case pass");
		}
		
		else {
			System.out.println("test case fail");
		}
	}
}
