package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    //System.out.println("Display status of logo is:" + logo.isDisplayed());
		//boolean status= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		//isEnabled
		//boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		//System.out.println("Radio button is enable : "+ status);
		
		//isSelected
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before selecting...");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		male_rd.click();
		System.out.println("after selecting male...");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
	
	}

}
