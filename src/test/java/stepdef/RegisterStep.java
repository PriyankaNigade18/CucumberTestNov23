package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterStep 
{
	WebDriver driver;
	@Given("Open Opencart application")
	public void open_opencart_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.manage().window().maximize();
	}

	@When("user open register page")
	public void user_open_register_page() {
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    
	}

	@When("user enters all the required field")
	public void user_enters_all_the_required_field(DataTable data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> d=data.cells();
	    driver.findElement(By.id("input-firstname")).sendKeys(d.get(1).get(0));
	    driver.findElement(By.id("input-lastname")).sendKeys(d.get(1).get(1));
	    driver.findElement(By.name("email")).sendKeys(d.get(1).get(2));
	    driver.findElement(By.name("telephone")).sendKeys(d.get(1).get(3));
	    driver.findElement(By.id("input-password")).sendKeys(d.get(1).get(4));
	    driver.findElement(By.name("confirm")).sendKeys(d.get(1).get(5));
	}

	@When("user click yes radio button")
	public void user_click_yes_radio_button() {
	    driver.findElement(By.xpath("(//input[@value=1])[2]")).click();
	}

	@When("user check privacy policy")
	public void user_check_privacy_policy() {

		driver.findElement(By.name("agree")).click();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    
	    
	}

	@Then("User should be able to register into open cart application")
	public void user_should_be_able_to_register_into_open_cart_application() {
		System.out.println("User register completed!");
	}


}
