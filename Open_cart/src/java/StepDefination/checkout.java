package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout 
{
	WebDriver driver;
	PageClass pg;

	@Given("open home page in default browser")
	public void open_home_page_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("click on checkout")
	public void click_on_checkout() throws InterruptedException
	{

		pg.checkout();
	}
	
	@Then("Check out done successfully")
	public void check_out_done_successfully() 
	{
		driver.close();
	}
}
