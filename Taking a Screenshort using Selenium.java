import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","E:\\Programing\\Gecko Dr\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();						          //We need to use ChromeDriver instead of WebDriver
		d.get("www.google.com");
		File Source =d.getScreenshotAs(OutputType.FILE);		    /*In ChromeDriver there is method called getScreenshortAs inside that we need to give output type is file.
																                              its return type is file so we need to store in file*/
		File destination = new File("E:\\Programing\\img1.png");          //here we need to give the location for store the img
		FileHandler.copy(Source, destination);					                  // This is for taking a copy of the image
		
		WebElement Sour = d.findElement(By.id("input"));		            //This is for Taking a Screenshort of perticular element we need to give the corresponding locator 
		File so =Sour.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Programing\\img2.png");
		FileHandler.copy(so, dest);
		
		d.quit();
	}

}
