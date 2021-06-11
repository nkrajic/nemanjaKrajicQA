package page;

import base.baseTestYahoo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class yahooSearchPage extends baseTestYahoo {

    public yahooSearchPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".fw-n.lh-xs.fz-14")
    WebElement sideLinkGoogle;

    public boolean verifyTextIsDisplayed (){
        wdwait.until(ExpectedConditions.visibilityOf(sideLinkGoogle));
        return sideLinkGoogle.isDisplayed();
    }
    public String compareText(){
        wdwait.until(ExpectedConditions.visibilityOf(sideLinkGoogle));
        return sideLinkGoogle.getText();
    }

}
