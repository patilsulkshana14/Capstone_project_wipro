package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Update_cart 
{
	WebDriver driver;
	PageClass pg;

	@Given("Add to cart page should open in default browser")
	public void add_to_cart_page_should_open_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("update quantity for product")
	public void update_quantity_for_product() throws InterruptedException 
	{
		pg.updatecart();
	}
	@Then("update quantity done successfully")
	public void add_to_cart_done_successfully() 
	{
		driver.close();
	}

}
