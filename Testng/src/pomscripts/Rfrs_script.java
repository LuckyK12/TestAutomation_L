package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rfrs_script {
	@FindBy(id="email")
	private WebElement uname;
	public Rfrs_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passdata()
	{
	uname.sendKeys("Lucky");	
	}
	

}
