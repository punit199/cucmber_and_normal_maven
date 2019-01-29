package Example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchTwoApp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it =set.iterator();
		System.out.println(set.size());
		String parId=it.next();
		String childId=it.next();
		System.out.println(childId);
		driver.switchTo().window(childId);
		driver.get("https://stackoverflow.com/");

	}

}
