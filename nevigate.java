package Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigate {

	public static void main(String[]args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.get("https://www.instagram.com/");
		
		URL link = new URL("https://www.instagram.com/");
		driver.navigate().to(link);
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
}
