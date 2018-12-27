package mavenproject.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
		   driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
           driver.get("https://demo.actitime.com/user/submit_tt.do");
           driver.findElement(By.name("username")).sendKeys("admin");
           driver.findElement(By.name("pwd")).sendKeys("manager");
           driver.findElement(By.xpath("//*[text()='Login ']")).click();
           driver.findElement(By.xpath("//table[@id='ext-comp-1002']/tbody/tr/td[2]")).click();
           driver.findElement(By.xpath("//table[@id='ext-comp-1005']/tbody/tr/td[2]")).click();
           Thread.sleep(2000);
           Calender cal = new Calender();
           cal.selectThedate("12-Nov-2018");
           Thread.sleep(5000);
           driver.close();
       
           
           
	}

}
