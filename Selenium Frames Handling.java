package SeleniumWorks;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Programing\\Drivers 2\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("URL");									                                           // we need to pass the website URL 
														
													                                          	/* There are three ways is there to switch the frame*/
														
		d.switchTo().frame(0);							                                    // We can pass the index value - 0,1,2...
		d.switchTo().frame("id/name");				                                  // we can pass id or name
		
		
		WebElement web =d.findElement(By.id("id"));   	                       // we need to pass the corresponding locator here
		d.switchTo().frame(web);     					                                 // we can pass the webElement
		
		d.switchTo().frame(0).switchTo().frame(0);		                         // this is for switching the nested frames directly  
		
		//if we wants to exit the frames 
		d.switchTo().parentFrame();			                                       // this is for came out one frame back from current frame
		
		// we can use defaultContent - for came out from all the nested frames 
		d.switchTo().defaultContent();
	}
}
