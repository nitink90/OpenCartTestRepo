package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ProductComparePage extends BaseLibrary{
	public ProductComparePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchBox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[text()='iMac']")
	private WebElement imac;
	
	@FindBy(xpath="//button[@onclick=\"compare.add('41');\"]")
	private WebElement compareBtn;
	
	public void enterProduct()
	{
		searchBox.sendKeys("iMac");
		searchBtn.click();
	}
	
	public void clickOnimac()
	{
		imac.click();
	}
	public void validateAndClickCompare() throws InterruptedException
	{
		moveToElement(compareBtn);
		Thread.sleep(5000);
		String actual = compareBtn.getDomAttribute("data-original-title");
		String expected = getReadData("tooltip");
		if(actual.equals(expected))
		{
			System.out.println("Tooltip validation Pass : " + actual);
		}
		else
		{
			System.out.println("Tooltip validation failed");
		}
		
		compareBtn.click();
	}

}
