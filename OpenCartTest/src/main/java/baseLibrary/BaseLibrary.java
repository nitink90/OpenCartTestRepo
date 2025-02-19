package baseLibrary;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationUtility.ApplicationUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements PropertyUtility, ApplicationUtility, WaitUtility{
	public static WebDriver driver = null;
	
	public void launchUrl(String key)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(getReadData(key));
		driver.manage().window().maximize();
	}
	//ahkfkghytjulkfd

	@Override
	public String getReadData(String key) {
		String val ="";
		String configpath="C:\\Users\\Lenovo\\eclipse-workspace\\OpenCartTest\\TestData\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(fis);
			val=prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in get read data : " + e);
		}
		return val;
	}

	@Override
	public void moveToElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

	@Override
	public void waitForClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
