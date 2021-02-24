package com.tripadvisor.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;

public class AvailableList extends TestBase{
	

	
	@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement ClickOnClubMahindra;
	
	
	
	public AvailableList(){
		PageFactory.initElements(driver, this);
	}
	
	public ClubMahindraDetails clickOnClubmahindraList() {
		ClickOnClubMahindra.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);          
		        //driver.close(); //closing child window
		        // driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		

		
		return new ClubMahindraDetails();
	}

}
