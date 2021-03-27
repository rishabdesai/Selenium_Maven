package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.name.com/account/create");
		
//		WebElement dropDownElement = driver.findElement(By.id("new-contact-country"));
//		Select select = new Select(dropDownElement);
		
		// Using select methods
		//select.selectByVisibleText("India"); //India
		//select.selectByValue("IN"); //India
		//select.selectByIndex(13); //Australia
	
		//Selecting option from dripdown without using Select class methods.
//		List<WebElement> options = select.getOptions();
//		for(WebElement webele : options) {
//			if(webele.getText().equals("Brazil")){
//				webele.click();
//				break;
//			}
//		}
//		
		//using generic method for multiple dropdown menus
		WebElement dropDownEle = driver.findElement(By.id("new-contact-country"));
		genericDropDownSelector(dropDownEle, "India");
	
	}
	
	//using generic method to access multiple dropdown menus
	public static void genericDropDownSelector(WebElement e, String value) {
		Select select = new Select(e);
		List<WebElement> options = select.getOptions();
		for(WebElement webele : options) {
			if(webele.getText().equals(value)){
				webele.click();
				break;
			}
		}
	
	}

}
