package mavenproject.mavenproject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test {

	@FindBy(xpath="//*")
    private List<WebElement> lts;

	public List<WebElement> getLts() {
		return lts;
	}

	public void setLts(List<WebElement> lts) {
		this.lts = lts;
	}
}
