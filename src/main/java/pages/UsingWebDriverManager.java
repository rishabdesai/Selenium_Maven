package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManager {

	public static void main(String[] args) {
		// using webDriverManager API we can avoid the downloading the driver and 
		//also hardcoding the location of driver.
		
		// to automatically set chromeDriver path
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		

	}

}
