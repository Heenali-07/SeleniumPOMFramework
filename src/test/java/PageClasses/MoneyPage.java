package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;

public class MoneyPage extends PageBaseClass
{
	
	public MoneyPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//@FindBy(xpath="//*[@id='signin_info']/a[1]")
	@FindBy(xpath="//*[@id='signin_info']/a[1]")
	public WebElement signinLink;
	
	public PortfolioLoginPage clickSignInLink()
	{
		signinLink.click();
		return PageFactory.initElements(driver,PortfolioLoginPage.class);
	}
	
}
