package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ForgetPassword  {

	public WebDriver driver;
By ForgetEmail=By.xpath("//input[@id='user_email']");
By Send=By.xpath("//input[@name='commit']");
	

	public ForgetPassword(WebDriver driver) {
		this.driver=driver;
	}

	public ForgetPassword enterEmail()
	{
		driver.findElement(ForgetEmail).sendKeys("ddd");;
		return new ForgetPassword(driver);
		
	}
	public ForgetPassword send()
	{
		
		driver.findElement(Send).click();;
		return new ForgetPassword(driver);
		
	}


}