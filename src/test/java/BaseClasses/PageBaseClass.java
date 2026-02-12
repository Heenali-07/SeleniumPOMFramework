package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageClasses.LandingPage;

public class PageBaseClass {
	
	// keeping driver initialization , open url etc on base class so taht other pages 
	public WebDriver driver;
	
	
	/******************************* Invoke Browser ****************************/
	
	public void invokeBrowser(String browserName) {
		
	/*try {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\eclipse-workspace\\SeleniumDemoProject\\drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\eclipse-workspace\\SeleniumDemoProject\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
			else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Heenali Raut\\eclipse-workspace\\SeleniumPOMFramework\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		}
	*/
		 try {
	            if (browserName.equalsIgnoreCase("Chrome")) {

	                // ✅ No driver path needed – Selenium Manager handles it
	                driver = new ChromeDriver();

	            } else if (browserName.equalsIgnoreCase("firefox")) {

	                driver = new FirefoxDriver();

	            } else if (browserName.equalsIgnoreCase("edge")) {

	                driver = new EdgeDriver();

	            } else if (browserName.equalsIgnoreCase("safari")) {

	                driver = new SafariDriver();

	            } else {

	                // ✅ Default: Chrome
	                driver = new ChromeDriver();
	            }
	        }
		 catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	
	}
	
	
	public LandingPage OpenApplication()
	{
		driver.get("https://www.rediff.com");
		return PageFactory.initElements(driver, LandingPage.class);
	}

	
	public void getTitle(String expectedTitle)
	{
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	

}