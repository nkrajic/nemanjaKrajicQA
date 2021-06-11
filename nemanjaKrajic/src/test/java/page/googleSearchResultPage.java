package page;

import base.baseTestYahoo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class googleSearchResultPage extends baseTestYahoo {

    public googleSearchResultPage(){ PageFactory.initElements(driver, this);}


    @FindBy (xpath = "//h3[contains(text(),\"Yahoo | Mail\")]")
    WebElement yahooLink;


    public void clickOnYahooLink (){
        wdwait.until(ExpectedConditions.visibilityOf(yahooLink));
        yahooLink.click();
    }
}
