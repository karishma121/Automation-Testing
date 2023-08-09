package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.findElement(By.className("card-body")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
