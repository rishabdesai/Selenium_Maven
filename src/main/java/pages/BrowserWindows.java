package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle() : returns ID of single browser window
//		String window1 = driver.getWindowHandle();
//		System.out.println(window1);
//		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		 
		
		//getWindowHandles() : return ID of multiple browser window
		Set<String> windowIDs = driver.getWindowHandles();
		
		
		//using iterator() method
//		Iterator<String> iterator = windowIDs.iterator();
//		String parentID = iterator.next();
//		String childID = iterator.next();
//		System.out.println(parentID);
//		System.out.println(childID);
		
		//user List collection 
		
	List<String> windowListID = new ArrayList(windowIDs); //convert set to list
//	String parentID = windowListID.get(0);
//	String childID = windowListID.get(1);
//	System.out.println(parentID);
//	System.out.println(childID);
//	
	
	//use of window ID's for switch to parent or child window page
//	driver.switchTo().window(parentID);
//	System.out.println("parent window title : "+driver.getTitle());
	
//	driver.switchTo().window(childID);
//	System.out.println("child window title : "+driver.getTitle());
	
	
	//to capture parent and child windowID using foreach loop
		for(String s:windowListID ) {
			//System.out.println(s);
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
	}
		
		driver.quit(); //close both browser window & close() method close single browser window 
	}
}
