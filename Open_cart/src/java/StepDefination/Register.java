package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
    WebDriver driver;
    PageClass pg;

    @Given("registration page should be open in default browser")
    public void registration_page_should_be_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
    }

    @When("user registers with {string} {string} {string} {string} {string} {string}")
    public void user_registers_with(String firstName, String lastName, String email, String telephone, String password, String confirmPassword) {
        pg.registerNewUser(firstName, lastName, email, telephone, password, confirmPassword);
    }

    @Then("registration successfully")
    public void registration_successfully() {
        driver.close();
    }
}
