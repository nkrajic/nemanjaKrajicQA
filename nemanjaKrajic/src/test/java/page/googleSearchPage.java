package page;

import base.baseTestYahoo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class googleSearchPage extends baseTestYahoo {

    public googleSearchPage(){
        PageFactory.initElements(driver, this);
    }

//    @FindBy(id = "firstname")
//    WebElement nameField;

    @FindBy(name = "q")
    WebElement searchTextBox;

    public void inputSearchBox (String googleSearchBox){
        wdwait.until(ExpectedConditions.visibilityOf(searchTextBox));
        searchTextBox.clear();
        searchTextBox.sendKeys(googleSearchBox);
        searchTextBox.sendKeys(Keys.ENTER);
    }


}
