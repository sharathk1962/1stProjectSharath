package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Itemtocart {

	public WebDriver driver;
	public Itemtocart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By instock=By.xpath("//ul/li[3]/div/div[2]/span");
	By addtocart=By.xpath("//a[@rel='nofollow'] [@data-id-product='7']");
	By continueshopping=By.cssSelector("span[title='Continue shopping']");
	
	public WebElement mouseoverinstock()
	{
		return driver.findElement(instock);
	}
	
	public WebElement additems()
	{
		return driver.findElement(addtocart);
	}
	
	public WebElement continueshoppingicon()
	{
		return driver.findElement(continueshopping);
	}
	
}
