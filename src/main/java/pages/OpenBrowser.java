package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		String key ="webdriver.chrome.driver";
		String value="C:\\Users\\d_ris\\OneDrive\\003_testing\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
