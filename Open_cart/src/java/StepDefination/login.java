package StepDefination;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    WebDriver driver;
    PageClass pg;

    @Given("login page should be open in default browser")
    public void login_page_should_be_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg = new PageClass(driver);
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in_with(String email, String password) {
        pg.loginUser(email, password);
    }

    @Then("login successfully")
    public void login_successfully() {
        driver.close();
    }
}
