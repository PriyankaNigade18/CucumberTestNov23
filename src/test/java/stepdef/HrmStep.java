package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmStep

{
	WebDriver driver;
	@Given("Open orangehrm application")
	public void open_orangehrm_application() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		}

	@When("User enter valid username {string}  and Valid password {string}")
	public void user_enter_valid_username_and_valid_password(String un, String psw) {
		//username
				driver.findElement(By.name("username")).sendKeys(un);
					
				//password
			   driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on Login button from Hrm")
	public void user_click_on_login_button_from_hrm()
	{
     driver.findElement(By.className("oxd-button")).click();
		
		
	}

	@Then("User should be login for only valid data set")
	public void user_should_be_login_for_only_valid_data_set() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Completed!");
	}


}
