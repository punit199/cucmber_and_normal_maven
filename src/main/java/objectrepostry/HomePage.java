package objectrepostry;

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
	
	public void loginToGmail(String userName,String password) throws Throwable
	{
		userEmailId.sendKeys(userName);
		submitBtn.click();
		WebDriverWait web = new WebDriverWait(WebDriverControl.driver,20);
		web.until(ExpectedConditions.visibilityOf(passwordText));
		passwordText.sendKeys(password);
		web.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();
	}

}
