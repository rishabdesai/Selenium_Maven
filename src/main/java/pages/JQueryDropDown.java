package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {

	public static void selectChoice(WebDriver driver, String... value) {
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement item : elements) {
				String text = item.getText();

				for (String val : value) {
					if (text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement item : elements) {
					item.click();
				}
			} catch (Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"); // launch web page
		driver.manage().window().maximize(); // maximize the window

		driver.findElement(By.id("justAnInputBox")).click();

		//selectChoice(driver,"choice 1");
		//selectChoice(driver,"choice 1", "choice 2","choice 2 2");
		selectChoice(driver,"all");



	}

}
