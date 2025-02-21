package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1) launch browser
 2) open URL https://demo.nopcommerce.com/
 3) validate title should be "nopCommerce demo store"
 4) close page 
 */
public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

	}

}
