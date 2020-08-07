package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage  {

	public WebDriver driver;

	By Login = By.xpath("//span[contains(text(),'Login')]");
	By Title= By.xpath("//h2[contains(text(),'Featured Courses')]");
	By Nav= By.xpath("//nav[@class='navbar-collapse collapse']");
    By header=By.xpath("//h3[contains(text(),'An Academy to learn Everything about Testing')]");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public LoginPage getLogin() {
		driver.findElement(Login).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public WebElement getTitle() {
		return driver.findElement(Title);
	}
	public WebElement getNav() {
		return driver.findElement(Nav);
	}
	public WebElement getHead() {
		return driver.findElement(header);
	}
}
