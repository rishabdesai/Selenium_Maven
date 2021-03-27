package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.name.com/account/create");
		
		WebElement dropDownElement = driver.findElement(By.id("new-contact-country"));
		Select select = new Select(dropDownElement);
		
		// Using select methods
		//select.selectByVisibleText("India"); //India
		//select.selectByValue("IN"); //India
		//select.selectByIndex(13); //Australia
	
		//Selecting option from dripdown without using Select class methods.
		List<WebElement> options = select.getOptions();
		for(WebElement e : options) {
			if(e.getText().equals("Brazil")){
				e.click();
				break;
			}
		}
	
	}

}
