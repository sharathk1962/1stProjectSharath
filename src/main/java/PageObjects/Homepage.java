package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;
	
public Homepage(WebDriver driver)
{
	this.driver=driver;
}

By signin= By.xpath("//a[@class='login']");


By womentab=By.xpath("//a[@title='Women']");
By summerdress=By.xpath("//a[@title='Summer Dresses']");
By search=By.id("search_query_top");
By submitsearch=By.cssSelector("button[name='submit_search']");


public WebElement clickonSignin()
{
	return driver.findElement(signin);
}

public WebElement mousemovetowomentab()
{
	return driver.findElement(womentab);
}

public WebElement clickonsummerdress()
{
	return driver.findElement(summerdress);
}

public WebElement search()
{
	return driver.findElement(search);
}

public WebElement submitsearchbutton()
{
	return driver.findElement(submitsearch);
}
}
