package pomscripts;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fk {
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement srch;
	@FindBy(xpath = "//div[.='Apple iPhone 15 (Black, 128 GB)']")
	private WebElement mbl;
	public Fk(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void item(String pdt)
	{
		srch.sendKeys(pdt);		
	}
	public void item1(Keys enter) {
		srch.sendKeys(Keys.ENTER);
	}
	public void clk()
	{
		mbl.click();
	}
		
	}
	


