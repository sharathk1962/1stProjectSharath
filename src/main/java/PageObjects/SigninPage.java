package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {

	public WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By email=By.id("email_create");
	By submitemail=By.cssSelector("button#SubmitCreate");
	
	public WebElement enteremailid()
	{
		return driver.findElement(email);
	}
	
	public WebElement submitemailid()
	{
		return driver.findElement(submitemail);
	}
}
