package Practice;

import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class E2einOne   {
	
	public static WebDriver driver=null;
	
	@Test
	public void overallinone() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","E:\\Eclipse - workplace\\FB-Autoomation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
			driver.get("http://automationpractice.com/");
/*		//	driver.manage().window().maximize();
			//homepage
			driver.findElement(By.xpath("//a[@class='login']")).click();
		//	driver.close();
			//signinpage - enter email address and click create account
			driver.findElement(By.id("email_create")).sendKeys("sharath.k1991@gmail.com");
		//	driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
			driver.findElement(By.cssSelector("button#SubmitCreate")).click();
			Thread.sleep(5000);
			//create account
			driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys("sharath");
			driver.findElement(By.name("customer_lastname")).sendKeys("kumar");
			//dropdown we use select class
			Select date=new Select(driver.findElement(By.name("days")));
			date.selectByValue("19");
			Select month=new Select(driver.findElement(By.name("months")));
			month.selectByVisibleText("September ");
			Select year=new Select(driver.findElement(By.name("years")));
			year.selectByValue("1991");
			driver.findElement(By.id("uniform-newsletter")).click();
			driver.findElement(By.xpath("//div[@id='uniform-optin']")).click();
			Select state=new Select(driver.findElement(By.name("id_state")));
			state.selectByIndex(3);
			driver.findElement(By.name("submitAccount")).click();
			driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
			*/
			
			//homepage mouseover and select Women-> Summer dresses
/*			Actions a =new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).build().perform();
			Thread.sleep(5000);
a.moveToElement(driver.findElement(By.xpath("//a[@title='Summer Dresses']"))).click().build().perform();

//summer page add few items to cart
driver.findElement(By.xpath("//ul/li[3]/div/div[2]/span")).click();
driver.findElement(By.xpath("//a[@rel='nofollow'] [@data-id-product='7']")).click();
driver.findElement(By.cssSelector("span[title='Continue shopping']")).click();    */

//using avscriptexecutor clciking on search and searching product with mouse
			Actions a =new Actions(driver);	
	WebElement search=driver.findElement(By.id("search_query_top"));
	a.click(search).keyDown(Keys.SHIFT).sendKeys("tshirssssssssssssssssssts").doubleClick().sendKeys(Keys.DELETE).build().perform();;
	



	
	 }
	}

	
	
