package com.tripadvisor.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;

public class ClubMahindraDetails extends TestBase{
	
	//@FindBy(xpath="//div[@class='_2cefqRQ2']//descendant::a")
	@FindBy(xpath="//a[@class='ui_button primary']")
	WebElement WriteAReview;
	
	@FindBy(name="+91 96111 92402")
	WebElement contact;
	
	@FindBy(id="HEADING")
	WebElement heading;
	
	@FindBy(xpath="//div[@aria-label='Tue Apr 13 2021']")
	WebElement date;
	
	@FindBy(id="bubble_rating")
	WebElement rating;
	
	@FindBy(xpath="//div[@class='easyClear bigRatingParent']")
	WebElement Hover;
	
	@FindBy(xpath="//span[@class='ui_bubble_rating fl bubble_50']")
	WebElement Hoverr;
	
	@FindBy(xpath="//input[@name='ReviewTitle']")
	WebElement TitleReview;
	
	@FindBy(id="REVIEW_TEXT")
	WebElement YourReview;
	
	public ClubMahindraDetails() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWriteReview() {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,2000)");
		
		WriteAReview.click();
	}
	
	
	public void mousehoverOnReview() {
		Actions action = new Actions(driver);
		action.moveToElement(Hoverr).build().perform();
	}
	
	public void titleOfYourReview(String reviewtitle) {
		TitleReview.click();
		TitleReview.sendKeys(reviewtitle);
	}
		
	public void yourReview(String yourreview) {
		TitleReview.click();
		TitleReview.sendKeys(yourreview);
	}
	
	
	}


