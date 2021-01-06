package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {

    WebDriver driver;

    public FormsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".element-group:nth-child(2) #item-0")
    private WebElement practiceForm;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastNameField;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "gender-radio-2")
    private WebElement genderRadioButtonTwo;

    @FindBy(how = How.ID, using = "userNumber")
    private WebElement numberField;

    @FindBy(how = How.ID, using = "dateOfBirthInput")
    private WebElement dateOfBirthField;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__month-select")
    private WebElement monthPicker;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__year-select")
    private WebElement yearPicker;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__day react-datepicker__day--019 react-datepicker__day--selected")
    private WebElement dayPicker;

    @FindBy(how = How.ID, using = "subjectsContainer")
    private WebElement subjectsField;

    @FindBy(how = How.ID, using = "hobbies-checkbox-1")
    private WebElement hobbiesRadioButton;

    @FindBy(how = How.ID, using = "uploadPicture")
    private WebElement uploadPictureButton;

    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement addressField;

    @FindBy(how = How.ID, using = "state")
    private WebElement stateSelect;



    public void clickPracticeForm(){
        practiceForm.click();
    }

    public void fillOutForm(){
        firstNameField.sendKeys();
        lastNameField.sendKeys();
        emailField.sendKeys();
        genderRadioButtonTwo.click();
        numberField.sendKeys();
        dateOfBirthField.click();
        yearPicker.click();
        monthPicker.click();
        dayPicker.click();
        subjectsField.sendKeys();
        hobbiesRadioButton.click();
        addressField.sendKeys();
        stateSelect.click();
    }






}
