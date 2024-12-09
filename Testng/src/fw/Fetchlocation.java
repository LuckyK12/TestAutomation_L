package fw;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fetchlocation {
	@Test

	public void fchloc() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	WebElement ele =	driver.findElement(By.xpath("//a[text()='తెలుగు']"));
Point p =	ele.getLocation();
	System.out.println(p);
	System.out.println(p.getX());
	System.out.println(p.getY());
	

	}

}
