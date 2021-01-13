package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(how = How.CSS, using = "input[id='gender-radio-2']")
    private WebElement genderRadioButtonTwo;

    @FindBy(how = How.ID, using = "userNumber")
    private WebElement numberField;

    @FindBy(how = How.ID, using = "dateOfBirthInput")
    private WebElement dateOfBirthField;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__month-select")
    private WebElement monthPicker;

    @FindBy(how = How.CLASS_NAME, using = "react-datepicker__year-select")
    private WebElement yearPicker;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")
    private WebElement dayPicker;

    @FindBy(how = How.ID, using = "subjectsInput")
    private WebElement subjectsField;

    @FindBy(how = How.ID, using = "hobbies-checkbox-1")
    private WebElement hobbiesRadioButton;

    @FindBy(how = How.ID, using = "uploadPicture")
    private WebElement uploadPictureButton;

    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement addressField;

    @FindBy(how = How.CSS, using = "#state .css-yk16xz-control")
    private WebElement stateSelect;

    //@FindBy(how = How.CSS, using = "#state .css-1uccc91-singleValue")
    private WebElement selectNCRState;

    @FindBy(how = How.CSS, using = "#city . css-yk16xz-control")
    private WebElement selectCity;

    //@FindBy(how = How.CSS, using = "#city .css-1uccc91-singleValue")
    private WebElement selectDelhiCity;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submitButton;

    @FindBy(how = How.ID, using = "example-modal-sizes-title-lg")
    private WebElement successModalHeading;

    @FindBy(how = How.ID, using = "closeLargeModal")
    private WebElement closeModalButton;


    public void clickPracticeForm(){
        practiceForm.click();
    }

    public void enterName() {
        firstNameField.sendKeys("test");
        lastNameField.sendKeys("test");
    }

    public void enterEmail() {
        emailField.sendKeys("test@test.com");
    }

    public void selectFemaleGender() {
        genderRadioButtonTwo.isSelected();
    }

    public void enterNumber() {
        numberField.sendKeys("2958565830");
    }

    public void selectDateOfBirth() {
        dateOfBirthField.click();

        Select month = new Select(monthPicker);
        month.selectByValue("8");

        Select year = new Select(yearPicker);
        year.selectByValue("1995");

        dayPicker.click();
    }

    public void enterSubjects() {
        subjectsField.sendKeys("com");
        subjectsField.sendKeys(Keys.ENTER);
    }

    public void selectHobbies() {
        hobbiesRadioButton.isSelected();
    }

    public void enterAddress() {
        addressField.sendKeys("test");
    }

    public void selectStateAndCity(){
        stateSelect.sendKeys("NCR", Keys.ENTER);
        selectCity.sendKeys("Delhi", Keys.ENTER);

    }

    public void submitForm(){
        submitButton.click();
    }

    public String successModalIsDisplayed(){
        return successModalHeading.getText();
    }

    public void closeModal(){
        closeModalButton.click();
    }






}
