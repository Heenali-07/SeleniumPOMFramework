package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;

public class LandingPage extends PageBaseClass {
	
	
	//Because we want to pass the WebDriver object from our test class to our page class.
	//when a\we will create object of landing page in test class we need it to come here for find element so we declare constructor here 
	//constructor of landing page
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
	//on landing page next step is to click on money link 
	// find web element "MONEY" using xpath
	@FindBy(xpath="//*[contains(@class,'toplinks')]/a[2]")
	public WebElement moneyLink;// variable for moneylink xpath
	
	//function to click on moneyLink
	
	public MoneyPage clickMoneyLink()// since after clicking on money link it will navigate to money page so return type is money
	{
		moneyLink.click();
		//“Create an object of the MoneyPage class, and automatically initialize all its elements using this driver.”
		//links one page to another page — where the user is supposed to land or jump next after performing an action
		//(like clicking a login button).
		return PageFactory.initElements(driver,MoneyPage.class);
	}
	
}
