package Pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Finddby {
	
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT, using ="SignIn") WebElement signin;
	@FindBy(how=How.NAME, using ="userName") WebElement uname;
	@FindBy(how=How.NAME, using ="password") WebElement password;
	@FindBy(how=How.XPATH, using ="//input[@value='Login']") WebElement Login;

	public Finddby(WebDriver driver) {
		this.driver=driver;
	}
		
	public void loginMethod(String uid , String pwd) {
		
		signin.click();
		uname.sendKeys(uid);
		password.sendKeys(pwd);
		Login.click();
	}
}
