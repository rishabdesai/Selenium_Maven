package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_locators {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("pass");
	driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
