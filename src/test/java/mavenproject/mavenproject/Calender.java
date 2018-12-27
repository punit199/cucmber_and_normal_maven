package mavenproject.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import generick.Baseclass;
import objectrepository.HomePage;

public class Calender extends Baseclass{

	/*static WebDriver driver = DatePicker.driver;*/

	public void selectThedate(String date) throws Throwable {
		String[] str = date.split("-");
		String day = str[0];
		String month = str[1];
		String year = str[2];

		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		selectMonth(month);
		selectday(day);

	}

	public static void selectMonth(String m) throws Throwable {
		Thread.sleep(5000);

		HomePage hg = PageFactory.initElements(driver, HomePage.class);
		List<WebElement> mon = hg.getAllMonths();
		/*
		 * List<WebElement> mon = driver.findElements(By.xpath(
		 * "//div[@class='x-date-mp']//table/tbody/tr/td[contains(@class,'x-date-mp-month')]/a"
		 * ));
		 */
		System.out.println(mon.size());
		for (WebElement wb : mon) {
			if (wb.getText().equals(m)) {
				wb.click();
				break;
			}
		}

		/*
		 * driver.findElement(By.xpath(
		 * "//div[@class='x-date-mp']//table/tbody/tr[7]/td/button[1]")).click();
		 */
		hg.getOkBtn().click();
	}

	public static void selectday(String d) {
		HomePage hg = PageFactory.initElements(driver, HomePage.class);
		List<WebElement> day = hg.getDateNumber();
		/*
		 * List<WebElement> day =driver.findElements(By.xpath(
		 * "//table[contains(@class,'x-date-inner')]/tbody/tr/td"));
		 */
		for (WebElement wb : day) {
			if (wb.getText().equals(d)) {
				wb.click();
				break;
			}
		}
	}
}
