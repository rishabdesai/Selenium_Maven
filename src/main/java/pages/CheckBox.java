package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		// select specific checkbox
		// driver.findElement(By.xpath("//input[@value='blue']")).click();

		// select all checkboxes
		List<WebElement> chkBox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'color')]"));
		System.out.println("total check box : " + chkBox.size());

		// using for loop
//	for( int i=0;i<=chkBox.size()-1;i++) {
//		chkBox.get(i).click();
//	}

		// using foreach loop
//	for( WebElement e :chkBox) {
//		e.click();
//	}

		// select multiple check boxes
//		for (WebElement e : chkBox) {
//			String chkName = e.getAttribute("value");
//			if (chkName.equals("green") || chkName.equals("blue")) {
//				e.click();
//			}
//		}

		//select last 3 check box
//		int totalSize = chkBox.size();
//		for(int i=totalSize-3;i<totalSize;i++) {
//			chkBox.get(i).click();
//		}
	
		//select first 3 check box
		for(int i=0;i<3;i++) {
			chkBox.get(i).click();
		}
		
	}

}
