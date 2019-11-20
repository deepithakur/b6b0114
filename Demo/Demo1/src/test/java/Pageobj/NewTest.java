package Pageobj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
 
  @Test
	public void abcd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream NEW\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Finddby locatelements= PageFactory.initElements(driver, Finddby.class);
		locatelements.loginMethod("lalitha","password123");
		
	}
	
}
