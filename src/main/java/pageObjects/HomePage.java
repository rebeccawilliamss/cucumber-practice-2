package pageObjects;

import managers.FileReaderManager;
import org.apache.velocity.runtime.directive.contrib.For;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private HomePage homePage;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".card:nth-child(2)")
    private WebElement formsLink;

    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public FormsPage clickFormsLink(){
        formsLink.click();
        return new FormsPage(driver);
    }

}

