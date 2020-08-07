package stepDefinations;

import org.junit.Assert;

import com.aventstack.extentreports.model.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PortalHomepage;
import resources.base;

public class stepdefination extends base{
	@Given("^initilize the browser with chrome$")
	public void initilize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in homepage to land on Secure sign in page$")
	public void click_on_Login_link_in_homepage_to_land_on_Secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getLogin();
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//LandingPage l=new LandingPage(driver);
		//LoginPage lp=l.getLogin();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
		lp.getGo().click();
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PortalHomepage p= new PortalHomepage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());
	    
	}	
}