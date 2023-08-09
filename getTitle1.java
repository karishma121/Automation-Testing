package revisionMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle1 {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String expectedTitle = "WhatsApp | Secure and Reliable Free Private Messaging and Calling";
		
		if(expectedTitle.equals(title)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
			
		}
	}
