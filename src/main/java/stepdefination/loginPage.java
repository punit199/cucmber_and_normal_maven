package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectrepostry.HomePage;
import objectrepostry.WebDriverControl;

public class loginPage {
	public static WebDriver driver = WebDriverControl.driver;
	@Given("^user are already in login page$")
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Before()
	public void logi()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@When("^verify the login page by title$")
	public void verifyThePage()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,"Gmail");

	}
	@And("^now enter the user name and password$")
	public void enterTheUserCreditional() throws Throwable
	{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		hp.loginToGmail("punitkumar847@gmail.com","jj");
	}
	
	@And("^now enter the username \"(.*)\" and password \"(.*)\"$")
	public void enterTheUse(String emailId,String password) throws Throwable
	{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		hp.loginToGmail(emailId,password);
	}
/*	@When("^now enter the username and password$")
	public void now_enter_the_username_and_password(DataTable credentials) throws Throwable {
		List<List<String>> data = credentials.raw();
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		hp.loginToGmail(data.get(0).get(0),data.get(0).get(1));
	  
	}*/

	@When("^now enter the username and password$")
	public void now_enter_the_username_and_password(DataTable dealDate) throws Throwable {
		for(java.util.Map<String,String> data :dealDate.asMaps())
		{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		hp.loginToGmail(data.get("user"),data.get("pass"));
		}
	}
	@Given("^This is a blank test$")
	public void This_is_a_blank_test() throws Throwable {
	   
	}
	@And("^Close The browser$")
	public void clickOnSubmitbtn()
	{
		driver.close();
	}

	@After()
	public void clickOnSubmit()
	{
		driver.close();
	}
}
