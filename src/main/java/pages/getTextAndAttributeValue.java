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
		
		System.out.println("using getAttribute - placeholder: "+emailValue.getAttribute("placeholder")); //return value of attribute
		System.out.println("using getText : "+emailValue.getText()); //return inner text 	
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("using getAttribute - type : "+btn.getAttribute("type"));
		System.out.println("using getAttribute - class : "+btn.getAttribute("class"));
		
		System.out.println("using getText : "+btn.getText());
		
		
		//get inner test using getText()
		String title = driver.findElement(By.xpath("//div[@class='forget-password text-right']//a")).getText();
		System.out.println(title);  // output - Forgot Password
		
		
	}
}
