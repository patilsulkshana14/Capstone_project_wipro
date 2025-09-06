package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders 
{
	WebDriver driver;
	PageClass pg;

	@Given("open orders page in default browser")
	public void open_orders_page_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("confirm orders")
	public void confirm_orders() 
	{
		pg.orders();
	}
	
	@Then("orders done successfully")
	public void orders_done_successfully() 
	{
		driver.close();
	}
}
