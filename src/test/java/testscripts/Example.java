package testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import generick.Baseclass;
import mavenproject.mavenproject.Calender;
import objectrepository.HomePage;

public class Example extends Baseclass {
	
	@Test()
	public void selectOurDate() throws Throwable
	{
		HomePage hg = PageFactory.initElements(driver,HomePage.class);
		hg.getDatepickerImg().click();
		hg.getMonthBtn().click();
        Thread.sleep(2000);
		Calender cal = new Calender();
        cal.selectThedate("12-Nov-2018");
	}

}
