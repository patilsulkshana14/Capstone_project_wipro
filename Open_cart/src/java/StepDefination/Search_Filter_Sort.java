package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Filter_Sort 
{
	WebDriver driver;
	PageClass pg;
	
	@Given("home page should be open in default browser")
	public void home_page_should_be_open_in_default_browser() {
	    
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	@When("click on search button eneter the product to search")
	public void click_on_search_button_eneter_the_product_to_search() 
	{
		pg.search();
	}
	
	@Then("search done successfully")
	public void search_done_successfully() 
	{
		driver.close();
	}
}
