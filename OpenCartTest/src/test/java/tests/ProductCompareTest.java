package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ProductComparePage;

public class ProductCompareTest extends BaseLibrary{
	ProductComparePage ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl("stagingUrl");
		ob = new ProductComparePage();
	}
	
	@Test(priority=1)
	public void enterProduct()
	{
		ob.enterProduct();
	}
	@Test(priority=2)
	public void clickOnimac()
	{
		ob.clickOnimac();
	}
	@Test(priority=3)
	public void validateandClickCompare() throws InterruptedException
	{
		ob.validateAndClickCompare();
	}
}
