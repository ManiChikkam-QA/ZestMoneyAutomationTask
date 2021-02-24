package com.tripadvisor.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//img[@class='_1AlVlFFs']")
	WebElement TripadvisorImg;
	
	@FindBy(xpath="//input[@placeholder='Where to?']")
	WebElement Searchbar;
	
	
	//Initializing the Page Objects:
		public HomePage(){
				PageFactory.initElements(driver, this);
			}
	//Actions:
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyTripadvisorImg() {
		return TripadvisorImg.isDisplayed();
	    	
		
	}
	
	public void searchItems(String name) {
		Searchbar.sendKeys(name);
		
	}
	public AvailableList submitSearch() {
		Searchbar.submit();
		return new AvailableList();
		
	}
		

}
