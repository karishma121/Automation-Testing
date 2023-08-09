package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public void name() {

	}
	public static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

	}
}
