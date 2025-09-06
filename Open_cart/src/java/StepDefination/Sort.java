package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sort 
{
	WebDriver driver;
	PageClass pg;
	
	@Given("home page should be open")
	public void home_page_should_be_open() {
	    
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("click on sort button")
	public void click_on_sort_button() 
	{
		pg.sort();
	}
	
	@Then("sort done successfully")
	public void sort_done_successfully() 
	{
		driver.close();
	}
}
