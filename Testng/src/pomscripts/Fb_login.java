package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login {
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(xpath="//button[@type='submit']")
private WebElement lgn;
public Fb_login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entermail(String id) {
un.sendKeys("id");
}
public void enterpwd(String password)
{
	pwd.sendKeys("password");
}
public void enter() {
	lgn.click();
}
}