package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageNavigation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//navigate forward and backword
		driver.get("http://www.amazon.in"); //same as driver.navigate().to("http://www.amazon.in");
		driver.get("https://www.flipkart.com/");
		
		//navigate back
		driver.navigate().back(); //opens amazon.in
		//navigate forward
		driver.navigate().forward(); //opens flipcart.com
		//to reload the page or refresh page
		driver.navigate().refresh();
		
		

	}

}
