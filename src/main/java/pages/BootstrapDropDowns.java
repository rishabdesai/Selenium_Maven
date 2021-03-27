package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		//click on first dropdown menu
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		//capture all dropdown elements
		List<WebElement> elementList1 = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		//count all elements
		System.out.println(elementList1.size());
		//loop through every element to match required value
		for(WebElement ele: elementList1) {
			if(ele.getText().equals("Cards")) {
				ele.click();
				break;
			}
		}
		
		//select second dropdown menu
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		//capture all dropdown elements
		List<WebElement> elementList2 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		//count all elements
		System.out.println(elementList2.size());
		//loop through every element to match required value
				for(WebElement ele: elementList2) {
					if(ele.getText().equals("Debit Cards")) {
						ele.click();
						break;
					}
				}
		
		
		
		
		
	
	
	}

}
