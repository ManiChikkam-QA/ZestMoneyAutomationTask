package com.tripadvisor.qa.testcases;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.pages.AvailableList;
import com.tripadvisor.qa.pages.ClubMahindraDetails;
import com.tripadvisor.qa.pages.HomePage;
import com.tripadvisor.qa.pages.ReviewPage;

public class ClubMahindraDetailsTest extends TestBase {
	
	HomePage homepage;
	AvailableList availablelist;
	ClubMahindraDetails clubmahindradetails;
	ReviewPage reviewpage;
	WebElement aboutMe;
	Actions actions;
	public ClubMahindraDetailsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Initialization(); 
		homepage = new HomePage();
		homepage.searchItems(prop.getProperty("hotelname"));
		availablelist=homepage.submitSearch();
		clubmahindradetails=availablelist.clickOnClubmahindraList();
		//availablelist.clickOnClubmahindraList();
		clubmahindradetails= new ClubMahindraDetails();
		ReviewPage reviewpage = new ReviewPage();	
		
	}
	
	
	@Test(priority=1)
	public void pageScrollDownTest() {
	
    	   clubmahindradetails.clickOnWriteReview();
	}
		
	
        
    @Test(priority=2)
    public void mousehoverOnReviewTest() {
    	
    	try {
     	   
    	clubmahindradetails.mousehoverOnReview();		
    }
    	 catch (Exception e)
        {
            e.printStackTrace();
            
        }
 	}
    @Test(priority=3)
    
   
    public void titleOfYourReviewTest() {
    	 try {
    	clubmahindradetails.titleOfYourReview(prop.getProperty("reviewtitle"));
    	clubmahindradetails.yourReview(prop.getProperty("yourreview"));	
    }
	 catch (Exception e)
   {
       e.printStackTrace();
       
    }
 }  
	

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
