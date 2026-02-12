package TestClass;

import org.testng.annotations.Test;

import BaseClasses.PageBaseClass;
import PageClasses.LandingPage;
import PageClasses.MoneyPage;
import PageClasses.MyPortfolioPage;
import PageClasses.PortfolioLoginPage;

public class MyPortfoilioTest {

	// create object of all page and base classes
	LandingPage landingpage;
	MoneyPage moneypage;
	MyPortfolioPage myportfoliopage;
	PortfolioLoginPage portfoliologinpage;
	//PageBaseClass pagebaseclass;
	
	@Test
	public void openPortfolio ()
	{
		PageBaseClass pageBase = new PageBaseClass();
		pageBase.invokeBrowser("Chrome");
		landingpage = pageBase.OpenApplication();
		moneypage = landingpage.clickMoneyLink();
		portfoliologinpage = moneypage.clickSignInLink();
		myportfoliopage = portfoliologinpage.doLogin("Heenali@gamil.com", "Abc123@");
		myportfoliopage.getTitle("Rediff MyPortfolio");

	}
	
}
