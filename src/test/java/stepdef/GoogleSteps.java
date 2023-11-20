package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps 
{
	WebDriver driver;

@Given("Open Google application")
public void open_google_application() 
{
    System.out.println("Google application open");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com");
  }

@When("I capture current title of google and compares with expected title")
public void i_capture_current_title_of_google_and_compares_with_expected_title() {
System.out.println("Google Current title is");
System.out.println(driver.getTitle());


}

@Then("Google page title should be Google")
public void google_page_title_should_be_google() {
    
	System.out.println("Test complete");
	Assert.assertTrue(driver.getTitle().equals("Google"),"Title is not matched");
	System.out.println("Title is matched!");
}


@When("I search with valid keyword")
public void i_search_with_valid_keyword()
{
    driver.findElement(By.id("APjFqb")).sendKeys("Java");
}

@Then("Google search should display valid result")
public void google_search_should_display_valid_result() {
   
	List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	System.out.println("Total options are: "+list1.size());
	
	for(WebElement i:list1)
	{
		System.out.println(i.getText());
	}
	
	
}

}
