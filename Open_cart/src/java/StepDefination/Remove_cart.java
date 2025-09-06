package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remove_cart 
{
	WebDriver driver;
	PageClass pg;

	@Given("open Add to cart page")
	public void open_add_to_cart_page() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("remove product from cart")
	public void remove_product_from_cart() throws InterruptedException 
	{
		pg.remove();
	}
	@Then("remove product done successfully")
	public void remove_product_done_successfully() 
	{
		driver.close();
	}
}
