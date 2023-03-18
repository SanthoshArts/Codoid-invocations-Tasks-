package SeleniumWorks;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class crossBrowserTesting {

	public static void main(String[] args) {
		String browser;
		WebDriver driver;                                          // first we need to declare the driver 
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Browser name ( Chrome / firefox)");
		browser = s.nextLine();

		switch(browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();                          // after that we need to initializing the driver if we what ChromeDriver()
			System.out.println("This is chrome browser");         // Inside this we need to give actual coding here instead of the printing statement 

		case "firefox":
			driver = new FirefoxDriver();                         // This is for FirefoxDriver() 
			System.out.println("This is firefox driver");
		}
	}

}
