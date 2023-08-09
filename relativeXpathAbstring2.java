package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpathAbstring2 {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("1234");
		driver.findElement(By.xpath("(//*[contains(@type,'submit')])")).click();
}
}
