package com.tripadvisor.qa.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.pages.AvailableList;
import com.tripadvisor.qa.pages.ClubMahindraDetails;
import com.tripadvisor.qa.pages.HomePage;

public class AvailableListTest extends TestBase {
	
	HomePage homepage;
	AvailableList availablelist;
	ClubMahindraDetails clubmahindradetails;

	
	public AvailableListTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Initialization(); 
		homepage = new HomePage();
		homepage.searchItems(prop.getProperty("hotelname"));
		availablelist=homepage.submitSearch();
		//availablelist = new AvailableList();
		clubmahindradetails= new ClubMahindraDetails();
		
	}
	
	@Test(priority=1)
	public void clickOnClubmahindraListTest() {
		clubmahindradetails= availablelist.clickOnClubmahindraList();
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
