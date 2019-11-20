package Pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {

	WebDriver driver;
	By linc = By.linkText("SignIn");
	By uname= By.name("userName");
	By pwd= By.name("password");
	By lin= By.xpath("//input[@value='Login']");
	
	public PageClass(WebDriver driver) {
		this.driver= driver;
	}
	
	public void linkclick() {
		driver.findElement(linc).click();
	}
	public void typeuname(String username) {
	driver.findElement(uname).sendKeys("Lalitha");
	}
	public void typepassword(String password) {
		driver.findElement(pwd).sendKeys("password123");
		}
	public void loginclick() {
		driver.findElement(lin).click();
		//driver.close();
	}
}
