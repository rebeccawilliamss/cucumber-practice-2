package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.FormsPage;
import pageObjects.HomePage;

public class Register {

    WebDriver driver;
    HomePage homePage;
    FormsPage formsPage;
    WebDriverManager webDriverManager;
    PageObjectManager pageObjectManager;

    @Given("I am on the forms page")
    public void i_am_on_the_forms_page() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        webDriverManager.setUpTest();
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateToHomePage();
        homePage.clickFormsLink();
    }

    @When("I enter the required data into the form")
    public void i_enter_the_required_data_into_the_form() {
        formsPage = pageObjectManager.getFormsPage();
        formsPage.clickPracticeForm();
        formsPage.enterName();
        formsPage.enterEmail();
        formsPage.selectFemaleGender();
        formsPage.enterNumber();
        formsPage.selectDateOfBirth();
        formsPage.enterSubjects();
        formsPage.selectHobbies();
        formsPage.enterAddress();
        formsPage.selectStateAndCity();
        formsPage.submitForm();
    }

    @Then("I should be successfully registered")
    public void i_should_be_successfully_registered() {
        Assert.assertTrue((formsPage.successModalIsDisplayed().contains("Thanks for submitting the form")));
        formsPage.closeModal();
        webDriverManager.closeDriver();
    }

}
