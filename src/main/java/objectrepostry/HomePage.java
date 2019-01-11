package objectrepostry;

import java.util.List;

import org.apache.velocity.tools.generic.ResourceTool.Key;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefination.loginPage;

public class HomePage {
	
	@FindBy(id="identifierId")
	private WebElement userEmailId;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement submitBtn;
	
	@FindBy(name="password")
	private WebElement passwordText;
	
	@FindBy(xpath="//table[@class='F cf zt']/tbody/tr/td/span/span[text()='27/12/2018']/../../preceding-sibling::td[3]")
	private List<WebElement> mail;
	
	public List<WebElement> getMail() {
		return mail;
	}

	public void loginToGmail(String userName,String password) throws Throwable
	{
		userEmailId.sendKeys(userName);
		Thread.sleep(5000);
		submitBtn.click();
		Thread.sleep(5000);
		/*WebDriverWait web = new WebDriverWait(WebDriverControl.driver,40);
		web.until(ExpectedConditions.visibilityOf(passwordText));*/
		Thread.sleep(7000);
		passwordText.sendKeys(password,Keys.ENTER);
		
		/*web.until(ExpectedConditions.elementToBeClickable(submitBtn));*/
		/*submitBtn.click();*/
	}

}
