package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDownsGenericMethod {

	public static void selectDropDownOption(List<WebElement> options, String value) {
		// loop through every element to match required value
		for (WebElement ele : options) {
			if (ele.getText().equals(value)) {
				ele.click();
				break;
			}
		}
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click(); // click on first dropdown menu
		List<WebElement> elementList1 = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li")); // capture all dropdown elements
		selectDropDownOption(elementList1, "Cards");

		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click(); // select second dropdown menu
		List<WebElement> elementList2 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li")); // capture all dropdown elements
		selectDropDownOption(elementList2, "Debit Cards");
	}
}
