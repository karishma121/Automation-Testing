package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {

	public static void main(String[]args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is ="+parentId);
		WebElement a1 = driver.findElement(By.xpath("http://www.Selenium143.blogspot.com"));
		a1.click();
		
		Set<String> chiledID = driver.getWindowHandles();
		int size = chiledID.size();
		System.out.println("ChiledID box size is= "+size);
		
		
		//1st way 
		/*for (String collection : chiledID) {
			System.out.println("Total Id collections is "+collection);
		}*/
		
		//2nd way 
		Iterator<String> it = chiledID.iterator();
		while(it.hasNext()) {
			String winId = it.next();
			//System.out.println(winId);
			
			if(!parentId.equalsIgnoreCase(winId)) {
				driver.switchTo().window(winId);
				String URL = driver.getCurrentUrl();
				System.out.println(URL);
				
				String Title = driver.getTitle();
				System.out.println(Title);
			}
		}
		}
}

