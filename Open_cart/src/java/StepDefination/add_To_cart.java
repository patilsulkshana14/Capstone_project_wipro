package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class add_To_cart 
{
	WebDriver driver;
	PageClass pg;

	@Given("Home page")
	public void home_page() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("goto home page and click on product")
	public void goto_home_page_and_click_on_product() throws InterruptedException 
	{
		pg.add_to_cart();
	}
	@Then("Add to cart done successfully")
	public void add_to_cart_done_successfully() 
	{
		driver.close();
	}
}
