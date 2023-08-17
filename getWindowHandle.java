package windowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[]args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
}
}

