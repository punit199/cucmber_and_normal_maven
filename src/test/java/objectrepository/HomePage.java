package objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage {
	
	@FindBy(xpath="//table[@id='ext-comp-1002']/tbody/tr/td[2]")
	private WebElement datepickerImg ;
	
	@FindBy(xpath="//table[@id='ext-comp-1005']/tbody/tr/td[2]")
	private WebElement monthBtn ;
	
	public WebElement getDatepickerImg() {
		return datepickerImg;
	}

	public WebElement getMonthBtn() {
		return monthBtn;
	}

	public List<WebElement> getAllMonths() {
		return allMonths;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public List<WebElement> getDateNumber() {
		return dateNumber;
	}

	@FindBy(xpath="//div[@class='x-date-mp']//table/tbody/tr/td[contains(@class,'x-date-mp-month')]/a")
	private List<WebElement> allMonths ;
	
	@FindBy(xpath="//div[@class='x-date-mp']//table/tbody/tr[7]/td/button[1]")
	private WebElement okBtn ;
	
	@FindBys({@FindBy(xpath="//table[contains(@class,'x-date-inner')]/tbody/tr/td")})
	private List<WebElement> dateNumber;

}
