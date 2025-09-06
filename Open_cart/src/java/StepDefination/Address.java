package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Address 
{
	WebDriver driver;
	PageClass pg;

	@Given("open Shipping page in default browser")
	public void open_Shipping_page_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("update Shipping details")
	public void update_shipping_details() 
	{
		pg.address();
	}
	
	@Then("Shipping done successfully")
	public void Shipping_done_successfully() 
	{
		driver.close();
	}
}

