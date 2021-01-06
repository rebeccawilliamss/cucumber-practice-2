package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class Register {

    WebDriver driver;
    HomePage homePage;
    WebDriverManager webDriverManager;
    PageObjectManager pageObjectManager;

    @Given("I am on the forms page")
    public void i_am_on_the_forms_page() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();

    }

    @When("I enter the required data into the form")
    public void i_enter_the_required_data_into_the_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be successfully registered")
    public void i_should_be_successfully_registered() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
