package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.base;


public class ValidateTitle extends base {
	public WebDriver driver;
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	LandingPage l;
	@BeforeTest
	public void initialize() throws IOException
	{
	driver=initializeDriver();
	Log.info("Driver is initialzed");
	driver.get(prop.getProperty("url"));
	Log.info("Navigated to home page");
	}

	@Test
	
	public void baseNavigation() throws IOException
	{
	 l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		Log.info("Successfully validated");		
	}
	@Test
	public void baseHead() throws IOException
	{
		l=new LandingPage(driver);
		Assert.assertEquals(l.getHead().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");	
	}
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
}
