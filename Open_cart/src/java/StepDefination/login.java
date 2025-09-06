package StepDefination;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login
{
	WebDriver driver;
	PageClass pg;
	
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	
	@When("click on login")
	public void click_on_login() 
	{
		pg.username();
		pg.password();
		pg.login();
	}
	@Then("login successfully")
	public void login_successfully() 
	{
		driver.close();
	}
}
