package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgetPassword;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class Homepage extends base {
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	driver=initializeDriver();
	
	}

	@Test(dataProvider="getData")
	
	public void baseNavigation(String email,String Password,String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		LoginPage lp=l.getLogin();
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(Password);
		Log.info(text);
		lp.getGo().click();
	ForgetPassword fp=lp.forgetPassword();
	fp.enterEmail();
			
	}
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="dinu@gmail.com";
		data[0][1]="123456";
		data[0][2]="Resticted User";
		
		data[1][0]="mon@gmail.com";
		data[1][1]="1234567";
		data[1][2]="non-Resticted User";
		return data;
	}
	
}
