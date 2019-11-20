package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testMe {
	
	WebDriver driver=null;
@Given("User is open the application")
public void user_is_open_the_application() {
	System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream NEW\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	String url="http://10.232.237.143:443/TestMeApp";
	driver.get(url);
	
   
}

@When("User click on to login link")
public void user_click_on_to_login_link() {
	driver.findElement(By.linkText("SignIn")).click();
  
}

@When("User enters {string} and {string}")
public void user_enters_and(String username, String password) {
	driver.findElement(By.id("userName")).sendKeys(username);
	 driver.findElement(By.id("password")).sendKeys(password);
    
}

@Then("Message displayed login successfully")
public void message_displayed_login_successfully() {
	driver.findElement(By.name("Login")).click();
	driver.close();
    
}


}
