package revisionMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl1 {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
	}
	

}
