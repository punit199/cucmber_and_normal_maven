package mavenproject.mavenproject;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDynamicTable {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("pksample4@gmail.com", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("punitkumar@16",Keys.ENTER);
		Thread.sleep(2000);
		String str=driver.getTitle();
		System.out.println(str);
		boolean flag =false;
	    if(str.contains("gmail"))
	    {
	    	flag=true;
	    	 System.out.println(flag);
	    }
	    assertTrue(flag);
	    Thread.sleep(2000);
	    WebElement wb=driver.findElement(By.xpath("//table[@id=':2y']/tbody/tr/td[9]/preceding-sibling::td[3]"));
	    String s=wb.getText();
	    System.out.println(s);
	    WebElement wb1=driver.findElement(By.xpath("//table[@class='a5Z']/tbody/tr/td[1]/div/div[1]"));
	    String s1=wb1.getText();
	    System.out.println(s1);
	    List<WebElement> lt = driver.findElements(By.xpath("//table[@class='a5Z']/tbody/tr/td[1]/following-sibling::td/div/div"));
	    System.out.println(lt.size());
	    for(WebElement w3:lt)
	    {
	    	System.out.println(w3.getText());
	    }
	    driver.quit();
	    

	}

}
