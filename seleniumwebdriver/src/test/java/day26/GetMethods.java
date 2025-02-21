package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//geturl(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle() - returns title of the webpage
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page 
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
		//String windowid = driver.getWindowHandle();
		//System.out.println("window ID :" + windowid);
		
		//getWindowHandles() - returns ID of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowid= driver.getWindowHandles();
		System.out.println(windowid);

	}

}
