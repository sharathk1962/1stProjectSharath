package Practice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Accountcreation;
import PageObjects.Homepage;
import PageObjects.SigninPage;
import resources.Base;

public class Creatingaccount extends Base {

	private static final String JavaScriptExecutor = null;
	//public WebDriver driver;
	
	Logger log=LogManager.getLogger(Creatingaccount.class.getName());
	@BeforeTest
	public void accountsetup() throws IOException, InterruptedException
	{

		driver=initailisedriver();
		Homepage hp=new Homepage(driver);
		hp.clickonSignin().click();
		SigninPage sp=new SigninPage(driver);
		sp.enteremailid().sendKeys("sharath.k1991@gmail.com");;
		sp.submitemailid().click();
		log.info("valid emai entered and please fill details");

	}

	@Test(priority=1)
	public void fillacoountdetails() throws InterruptedException {

		Accountcreation ac=new Accountcreation(driver);
		WebDriverWait wb=new WebDriverWait(driver, 10);
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='uniform-id_gender1']")));
		ac.selectgender().click();
		ac.selectfirstname().sendKeys("Sharath");
		ac.selectlastname().sendKeys("Kumar");
		log.debug("Succesfully selected Firstname , Lastname and gender entered");
		WebElement day=driver.findElement(By.name("days"));
		WebElement month=driver.findElement(By.name("months"));
		WebElement year=driver.findElement(By.name("years"));
		Select date=new Select(day);
		date.selectByValue("19");
		Select months=new Select(month);
		months.selectByVisibleText("September ");
		Select years=new Select(year);
		years.selectByValue("1991");
        log.info("date of birth entered");
		ac.selectnewslettercheckbox().click();
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//  js.executeScript("window.scrollBy(0,1000)");
		ac.submitaccountdetails().click();;
		log.error("account details submitted");
		ac.navigatetohomepage().click();;
	}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}


}
