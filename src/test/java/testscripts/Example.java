package testscripts;

import java.time.LocalDate;

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
		LocalDate date=LocalDate.now();
        cal.selectThedate(date.toString());
	}

}
