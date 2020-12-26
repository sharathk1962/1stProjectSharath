package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Base {

	public static WebDriver driver=null;

	public WebDriver initailisedriver() throws IOException
	{
		Properties prop=new Properties();

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		String urlname=prop.getProperty("url");

		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Eclipse - workplace\\FB-Autoomation\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(urlname);
		}

		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Eclipse - workplace\\FB-Autoomation\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(urlname);
		}
		
		if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","E:\\Eclipse - workplace\\FB-Autoomation\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get(urlname);
		}
		return driver;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(src,new File(destinationFile));
		return destinationFile;

		
	}
}
