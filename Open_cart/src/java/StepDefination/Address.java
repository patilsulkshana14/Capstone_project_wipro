package StepDefination;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Address {
    WebDriver driver;
    PageClass pg;

    @Given("open Shipping page in default browser")
    public void open_Shipping_page_in_default_browser() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
        pg.loginUser();    
       }

    @When("update Shipping details {string} {string} {string} {string} {string} {string}")
    public void update_shipping_details(String firstName, String lastName, String address, String zip, String country, String state) {
        pg.updateAddress(firstName, lastName, address, zip, country, state);
    }

    @Then("Shipping done successfully")
    public void Shipping_done_successfully() {
        driver.close();
    }
}
