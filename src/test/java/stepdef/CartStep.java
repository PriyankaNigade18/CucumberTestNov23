package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartStep 
{
	WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  // List<Map<String,String>> data=table.asMaps();
		
		
		List<Map<String,String>> map=table.asMaps(String.class,String.class);
		driver.findElement(By.id("input-email")).sendKeys(map.get(0).get("email"));
	    driver.findElement(By.name("password")).sendKeys(map.get(0).get("pas"));

	   
//		List<List<String>> data=table.cells();
//		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));

	 
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	   
	}

	@Then("User should be able to login into opencart")
	public void user_should_be_able_to_login_into_opencart()
	{
	    System.out.println("User login is completed!");
	}


}
