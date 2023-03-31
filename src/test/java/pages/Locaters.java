package pages;

import utilities.GWD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement SSN;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "(//input[@class='button'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMessage;

//    public WebElement getWebElement(String strButton){
//
//        switch (strButton)
//        {
//            case "addButton" : return addButton;
//            case "saveButton" : return saveButton;
//            case "nameInput" : return nameInput;
//            case "codeInput" : return codeInput;
//            case "integrationCode" : return integrationCode;
//            case "priorityCode" : return priorityCode;
//            case "toggleBar" : return toggleBar;
//            case "academicPeriod" : return academicPeriod;
//            case "academicPeriod1" : return academicPeriod1;
//            case "gradeLevel" : return gradeLevel;
//            case "gradeLevel2" : return gradeLevel2;
//        }
//        return null;
//    }


//    public void deleteItem(String searchedText) {
//        sendKeysFunction(searchInput, searchedText);
//        clickFunction(searchButton);
//        // wait.until(ExpectedConditions.elementToBeClickable(searchButton));
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
//        clickFunction(deleteImageButton);
//        clickFunction(deleteDialogButton);
//    }
}
