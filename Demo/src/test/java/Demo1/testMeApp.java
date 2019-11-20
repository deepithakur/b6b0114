package Demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class testMeApp {
	
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream NEW\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp";
		driver.get(url);
		driver.findElement(By.linkText("SignIn")).click();
		
	  }

	@When("user enters Lalitha as username")
	public void user_enters_Lalitha_as_username() {
		 driver.findElement(By.id("userName")).sendKeys("Lalitha");
	   }

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		 driver.findElement(By.id("password")).sendKeys("password123");
	   }

	@Then("user will finds a testmeapp home page")
	public void user_will_finds_a_testmeapp_home_page() {
		driver.findElement(By.name("Login")).click();
		System.out.println("the page title is"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home"));
		 
	    }



}
