package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage  {

	public WebDriver driver;

	By Email = By.xpath("//input[@id='user_email']");
	By Password = By.xpath("//input[@id='user_password']");
	By Go = By.xpath("//input[@name='commit']");
	By ForgetPassword=By.xpath("//a[@class='link-below-button']");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(Email);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getGo() {
		return driver.findElement(Go);
	}
	public ForgetPassword forgetPassword() {
		driver.findElement(ForgetPassword).click();
		ForgetPassword fp=new ForgetPassword(driver);
		return fp;
	}
}