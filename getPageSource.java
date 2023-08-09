package revisionMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
	}
}
