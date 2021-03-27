// isDisplayed(), isEnabled(), isSelected()

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		WebElement element =driver.findElement(By.xpath("//input[@title='Search']"));
		
		System.out.println("Display status :  "+element.isDisplayed());
		
		System.out.println("Enabled status :  "+element.isEnabled());
		
		System.out.println("Selected status :  "+element.isSelected());
		
		element.click(); //to select the element
		
		
		
		
		

	}

}
