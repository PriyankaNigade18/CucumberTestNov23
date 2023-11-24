package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetup;
import io.cucumber.java.en.*;

public class CRMStep 
{
	
	public WebDriver driver=BrowserSetup.getDriver();
	

@Given("Open CRM application")
public void open_crm_application()
{
//    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    driver.get("https://automationplayground.com/crm/");
	
	
}

@When("I click on SignIn link")
public void i_click_on_sign_in_link() 
{
    driver.findElement(By.id("SignIn")).click();
    
}

@Then("SignIn page should open")
public void sign_in_page_should_open() {
    Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Link is not working");
    System.out.println("SignIn lik works...SignIn page open");
}



@When("I enter valid emailid {string} and valid password {string}")
public void i_enter_valid_emailid_and_valid_password(String email, String psw)
{
	//driver.findElement(By.id("SignIn")).click();
	driver.findElement(By.id("email-id")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(psw);
	
	
}

@When("I click on Submit button")
public void i_click_on_submit_button() {
    driver.findElement(By.id("submit-id")).click();
}

@Then("I should be able to login and It should navigate to Customers page")
public void i_should_be_able_to_login_and_it_should_navigate_to_customers_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login fail");
System.out.println("Login completed!...customers page is open");
}

//@Given("User should be login")
//public void user_should_be_login() {
//	driver.findElement(By.id("SignIn")).click();
//	driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("test123");
//	driver.findElement(By.id("submit-id")).click();
//}


@When("I login into application click on Signout link")
public void i_login_into_application_click_on_signout_link()
{
	
    driver.findElement(By.linkText("Sign Out")).click();
}

@Then("I should able to logout")
public void i_should_able_to_logout() {
    Assert.assertTrue(driver.getCurrentUrl().contains("sign-out"),"SignOut Fails");
    System.out.println("SignOut completed!");
}




}
