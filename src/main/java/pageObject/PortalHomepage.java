package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalHomepage  {

	public WebDriver driver;

	By SearhBox = By.name("query");
	

	public PortalHomepage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSearchBox() {
		return driver.findElement(SearhBox);
	}
	
	
}