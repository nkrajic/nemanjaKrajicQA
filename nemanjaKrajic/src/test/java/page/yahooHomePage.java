package page;

import base.baseTestYahoo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class yahooHomePage extends baseTestYahoo {

    public yahooHomePage(){ PageFactory.initElements(driver, this);}
    @FindBy (linkText = "News")
    WebElement newsLink;

    public void yahooNewaLink (){
        wdwait.until(ExpectedConditions.visibilityOf(newsLink));
        newsLink.click();
    }

}
