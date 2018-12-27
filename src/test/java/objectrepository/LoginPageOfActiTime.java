package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageOfActiTime {
	@FindBy(name="username")
	private WebElement userText;
	
	@FindBy(name="pwd")
	private WebElement passtext;
	
	@FindBy(xpath="//*[text()='Login ']")
	private WebElement loginBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logOutBtn;
	public void loginToApp(String username , String password)
	{
		userText.sendKeys(username);
		passtext.sendKeys(password);
		loginBtn.click();
	}
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

}
