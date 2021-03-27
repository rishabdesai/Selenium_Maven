package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextAndAttributeValue {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/supplier");
		
		WebElement emailValue = driver.findElement(By.name("email"));
		emailValue.clear();  //clear the context of input box
		emailValue.sendKeys("test@email.com");  //enter values in input box
		
		System.out.println("using getAttribute : "+emailValue.getAttribute("placeholder")); //return value of attribute
		System.out.println("using getText : "+emailValue.getText()); //return inner text 	
	}
}
