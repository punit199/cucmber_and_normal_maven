package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchTheBrowserByWindow {
	 static WebDriver driver;
	@Test
	public void lunch() throws Throwable
	{   
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://mail.google.com/");
	driver.findElement(By.cssSelector("#identifierId")).sendKeys("pksample4@gmail.com",Keys.ENTER);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("punitkumar@16",Keys.ENTER);
	Thread.sleep(2000);
	WebElement wb =driver.findElement(By.cssSelector("div[class^='z'] div"));
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(wb));
	wb.click();
	WebElement wb1 = driver.findElement(By.xpath("//*[text()='Send']"));
	wait.until(ExpectedConditions.visibilityOf(wb1));
	WebElement wb2=driver.findElement(By.name("to"));
	wb2.sendKeys("punitkumar847@gmail.com",Keys.ENTER,Keys.TAB);
	driver.findElement(By.name("subjectbox")).sendKeys("css selector done",Keys.TAB);
	driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf')]")).sendKeys("hii,",Keys.TAB);
	wb1.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='aio UKr6le'])[4]//a")).click();

	}

}
