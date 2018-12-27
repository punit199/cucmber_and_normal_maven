package generick;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.LoginPageOfActiTime;

public class Baseclass {
	public static WebDriver driver;
	FileUtile fil = new FileUtile();
	
	@BeforeClass()
	public void lunchBrowser()
	{
		String browser = null;
		
		try
		{
		Properties pObj =fil.getBaseData();
		browser = pObj.getProperty("BOWSER");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equals("firfox"))
		{
			driver=new FirefoxDriver();
		}
	}
	@BeforeMethod()
	public void lunchApp() throws IOException
	{
		Properties pObj =fil.getBaseData();
		String url = pObj.getProperty("URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(url);
		LoginPageOfActiTime log = PageFactory.initElements(driver,LoginPageOfActiTime.class);
		log.loginToApp(pObj.getProperty("USERNAME"),pObj.getProperty("PASSWORD"));
	}
	@AfterMethod()
	public void closeApp()
	{
		LoginPageOfActiTime log = PageFactory.initElements(driver,LoginPageOfActiTime.class);
		WebElement wd=log.getLogOutBtn();
		wd.click();
	}
	
	@AfterClass()
	public void closeBrowser()
	{
		driver.close();
	}

}
