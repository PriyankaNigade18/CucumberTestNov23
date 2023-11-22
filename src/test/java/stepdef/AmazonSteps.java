package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps
{
	WebDriver driver;
	@Given("Open Amazon application")
	public void open_amazon_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	}

	@When("I get the current title for homepage")
	public void i_get_the_current_title_for_homepage() {
	    System.out.println("Home page title: "+driver.getTitle());
	}

	@Then("Title should be valid for homepage")
	public void title_should_be_valid_for_homepage() {
	   Assert.assertTrue(driver.getTitle().contains("India"),"Title not matched");
	   System.out.println("Title matched!");
	}

	@When("I am on bestseller page")
	public void i_am_on_bestseller_page() {
	   driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("I get the current title for bestsessler")
	public void i_get_the_current_title_for_bestsessler() {
	    System.out.println(driver.getTitle());
	}

	@Then("title should be match for bestsesser")
	public void title_should_be_match_for_bestsesser() {
	   Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title not match");
	   System.out.println("Title is matched!");
	}

	@When("I am on Mobile page")
	public void i_am_on_mobile_page() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("I get the current title for mobile")
	public void i_get_the_current_title_for_mobile() {
	    System.out.println(driver.getTitle());
	}

	@Then("title should be match for mobile")
	public void title_should_be_match_for_mobile() {
		Assert.assertTrue(driver.getTitle().contains("Phones"),"Title not match");
		   System.out.println("Title is matched!");
	}



}
