package testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import generick.Baseclass;
import generick.NumberOfBrokenLink;
import objectrepository.HomePage;

public class BrokenLink extends Baseclass{
	
	@Test
	public void getTheBrokenLink()
	{
		HomePage hg = PageFactory.initElements(driver,HomePage.class);
		List<WebElement> link =hg.getLt();
		System.out.println(link.size());
		for(int i=0;i<=link.size()-1;i++)
		{
			WebElement wb=link.get(i);
			String url=wb.getAttribute("href");
			NumberOfBrokenLink nb= new NumberOfBrokenLink();
			nb.getTheLink(url);
		}
		NumberOfBrokenLink nb= new NumberOfBrokenLink();
		System.out.println(nb.getCount());
	}

}
