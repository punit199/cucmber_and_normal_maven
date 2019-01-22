package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	
	@Test()
	public void upLoadfile() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("pksample4@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("punitkumar@16",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
/*		WebElement upload=driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td[4]/div/div[1]"));
		upload.click();
		Thread.sleep(5000);*/
		driver.findElement(By.cssSelector("intput[type='file']")).sendKeys("C:\\Users\\TYSS\\Desktop\\pk.txt");
	}

}
