package com.tripadvisor.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.pages.AvailableList;
import com.tripadvisor.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	AvailableList availablelist;
	
	
	public HomePageTest () {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Initialization(); 
		homepage = new HomePage();	
	}
    
	@Test(priority=1)
	public void verifyPageTitleTest() {
		String title=homepage.verifyPageTitle();
		//Assert.assertEquals(title, "Tripadvisor Official Site?");
		//System.out.println(title);
		}
	
	@Test(priority=2)
	public void verifyTripadvisorImgTest() {
		boolean flag=homepage.verifyTripadvisorImg();
	}
	
	@Test(priority=3)
	public void searchItemsTest() {
		homepage.searchItems(prop.getProperty("hotelname"));
		availablelist=homepage.submitSearch();
		
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
	
