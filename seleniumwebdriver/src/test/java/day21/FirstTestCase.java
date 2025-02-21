package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  Test case - 
  1) Launch browser(chrome)
  2) open URL https://demo.opencart.com/
  3) Validate title should be "your store"
  4) close browser 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("your store"))
			System.out.println("Test passed");
		else
		{
			System.out.println("Test failed");
		}
		driver.close();

	}

}
