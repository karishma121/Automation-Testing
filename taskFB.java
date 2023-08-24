package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class taskFB {

	public static <HTTPURLConnections> void main(String[]args) throws InterruptedException, IOException {
		int validLink=0;
		int invalidLink=0;
		
		WebDriver driver = new EdgeDriver();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Links in the Page is " + links.size());
		
		for (int i = 1; i<links.size(); i++) {
	         WebElement links1 = links. get(i);
	         
	         String Text = links1.getAttribute("href");
	         //System.out.println(Text);
	         
	         try {
	        	 
	        	 URL linkURL = new URL(Text);
		         
		         HttpURLConnection http = (HttpURLConnection)linkURL.openConnection();
		         http.setConnectTimeout(3000);
		        
		         http.setRequestMethod("GET");
		         http.connect();
		        
		         int status =http.getResponseCode();
		         System.out.println(status);
		         
		         
		         if(status==200) {
		        	 
		        	 validLink++;
		        	 
		        	 System.out.println("The valid link is =" +linkURL);
		         }
		         
		         else {
		        	 invalidLink++;
		        	 System.out.println("Invalid LInks are= "+linkURL);
		        			        	 
		         }
		         } 
	         	
	         catch(Exception e) {
	        	 
	        	 System.out.println(e.getMessage());
	        	 
	         }
		} 
		System.out.println("Valid count is =" +validLink++);
		System.out.println("Invalid count is =" +invalidLink++);
	         
		        
		         
			}
		
	         

	         
	
	         }

