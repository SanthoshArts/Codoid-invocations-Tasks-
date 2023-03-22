package SeleniumWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Programing\\Drivers 2\\chromedriver.exe");
		WebDriver d=new ChromeDriver();		// This is launching the driver
		d.get("www.google.com");			// load the URL here
		
		Set<String> windows =d.getWindowHandles();	// in Selenium There is a method called WindowHandles. Return type is set of string so we need to store the all windows in set
		List<String> List = new ArrayList<String>(windows); //we need to convert the all windows Set to List. why because there is no get method in set that's y switch set to list
		d.switchTo().window(List.get(1));			// This is for switch to current window to new window. now the driver focusing on the new opened window. 
		
		System.out.println(d.getCurrentUrl());
	}

}
