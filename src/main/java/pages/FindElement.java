package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in");

		//findElement()  - for single webElement, returns single element
		WebElement oneElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		oneElement.sendKeys("home");
		
		//findElement()  - for multiple webElement, return first element
		WebElement firstElement = driver.findElement(By.xpath("//div[@id='navFooter']//a"));
		System.out.println(firstElement.getText());  //output : Back to top
	}

}