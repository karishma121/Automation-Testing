package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String expectedTitle="Facebook – log in or sign up";
		
		if(expectedTitle.equals(title)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
	}
}
