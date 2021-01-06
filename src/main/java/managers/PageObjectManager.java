package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.FormsPage;
import pageObjects.HomePage;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private FormsPage formsPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public FormsPage getFormsPage(){
        return (formsPage == null) ? formsPage = new FormsPage(driver) : formsPage;
    }
}
