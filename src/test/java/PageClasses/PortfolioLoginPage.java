package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.PageBaseClass;

public class PortfolioLoginPage  extends PageBaseClass{
	 public PortfolioLoginPage (WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
		@FindBy(id="useremail")
		public WebElement useremail_TextBox;
		
		
		@FindBy(id="userpass")
		public WebElement password_TextBox;
		
		
		@FindBy(id="loginsubmit")
		public WebElement emailSubmit_button;
		
		public MyPortfolioPage doLogin(String username, String password)
		{
			useremail_TextBox.sendKeys(username);
			password_TextBox.sendKeys(password);
			emailSubmit_button.click();
			
			return PageFactory.initElements(driver, MyPortfolioPage.class);
		}

}
