package Practice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.Itemtocart;
import resources.Base;

public class Addingtocart extends Base {
	
	public static Logger log=LogManager.getLogger(Addingtocart.class.getName());
		

	@BeforeTest
	public void launchbrowser() throws IOException
	{
		driver=initailisedriver();
	}

	@Test
	public void additemstocart() throws InterruptedException
	{

		Homepage hp=new Homepage(driver);
		hp.search().click();
		hp.search().sendKeys("Tshirts");
		hp.submitsearchbutton().click();
		log.info("succesfully searched tshirts");
		log.info("changed some code - m working as y perosn");
		Thread.sleep(6000);
		Actions a =new Actions(driver);
		//	a.sendKeys(Keys.SHIFT).sendKeys("thsirt sent in small letter").build().perform();

		//navigates to women tab and search for summer dresses

		WebElement womentab=driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(womentab).build().perform();
		log.debug("succesfully moved to Women");
		Thread.sleep(6000);
		WebElement summerdresses=driver.findElement(By.xpath("//a[@title='Summer Dresses']"));
		a.moveToElement(summerdresses).click().build().perform();
		log.error("navigates to women tab and searched for summer dresses");


		//Once navigates to summer tab add items to cart and continue shopping
		Itemtocart ic=new Itemtocart(driver);
		ic.mouseoverinstock().click();
		ic.additems().click();
		WebElement shoppingtext=driver.findElement(By.cssSelector("span[title='Continue shopping']"));
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(shoppingtext));
		ic.continueshoppingicon().click();
		log.info("Succesfully added items to the cart");

	}


}
