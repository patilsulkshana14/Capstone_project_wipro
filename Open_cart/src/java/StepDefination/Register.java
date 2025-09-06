package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register 
{
	WebDriver driver;
	PageClass pg;
	
	@Given("registration page should be open in default browser")
	public void registration_page_should_be_open_in_default_browser() 
	{
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
	}
	
	@When("click on my account click on register enter details and password")
	public void click_on_my_account_click_on_register_enter_details_and_password()  
	{
		pg.reg();
	}
	@And("click on forget password")
	public void click_on_forget_password() 
	{
		pg.forgetpass();
	}
	
	@Then("registration successfully")
	public void login_successfully() 
	{
		driver.close();
	}
}


