package webElementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testkru.com/Elements/Buttons");
		String backgroundColor = driver.findElement(By.name("leftClick")).getCssValue("background");
		System.out.println("Background color code is ="+backgroundColor);
		
		String Expected = ("rgb(255, 186, 0)");
		String actualValue = driver.findElement(By.name("leftClick")).getCssValue("background");
		
		if(actualValue.contains(Expected)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case fails");
		}
		
}
}
