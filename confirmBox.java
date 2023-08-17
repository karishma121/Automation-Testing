package AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmBox {

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement confirm = driver.findElement(By.xpath("//input[@id='confirm']"));
		confirm.click();
		Thread.sleep(2000);
		
		Alert popup1 = driver.switchTo().alert();
		
		popup1.accept();
		//Thread.sleep(2000);
	}
}
