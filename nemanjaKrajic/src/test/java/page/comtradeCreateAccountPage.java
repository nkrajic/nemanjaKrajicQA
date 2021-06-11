package page;
import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class comtradeCreateAccountPage extends baseTest {

    public comtradeCreateAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    WebElement nameField;
    @FindBy(id = "lastname")
    WebElement lastnameField;
    @FindBy(id = "email-addsress")
    WebElement emailField;
    @FindBy(id = "is_subscribed")
    WebElement checkBoxField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmation")
    WebElement confirmPassField;
    @FindBy(xpath = "//span[contains(text(),\"Pošalji\")]")
    WebElement sendButton;



    public void inputNameField (String name){
        wdwait.until(ExpectedConditions.visibilityOf(nameField));
        nameField.clear();
        nameField.sendKeys(name);
    }
    public void inputLastNameField (String lastname){
        wdwait.until(ExpectedConditions.visibilityOf(lastnameField));
        lastnameField.clear();
        lastnameField.sendKeys(lastname);
    }
    public void inputEmailField (String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void inputPasswordField (String password){
        wdwait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void inputConfirmPasswordField (String confirmPass){
        wdwait.until(ExpectedConditions.visibilityOf(confirmPassField));
        confirmPassField.clear();
        confirmPassField.sendKeys(confirmPass);
    }
    public void clickNewLetterCheckbox(){
        wdwait.until(ExpectedConditions.visibilityOf(checkBoxField));
        if (checkBoxField.isSelected())
            checkBoxField.click();
    }
    public void clickSendButton(){
        wdwait.until(ExpectedConditions.visibilityOf(sendButton));
        sendButton.click();
    }



}
