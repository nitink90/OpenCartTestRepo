package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println("browser ID:" + driver.getWindowHandle());
		//driver.findElement(By.xpath("//a[text()='merrymoonmary']")).click();
		//Set<String> windowid = driver.getWindowHandles();
		//System.out.println(windowid);
		
		boolean dstatus = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
		System.out.println("Display status:"+ dstatus );
		
		boolean enablestatus = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println("enable status:" +enablestatus);
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));
		System.out.println("Before selecting...");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("After selecting...");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
	}

}
