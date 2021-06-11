package page;

import base.baseTestYahoo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class yahooNewsPage extends baseTestYahoo {

    public yahooNewsPage(){ PageFactory.initElements(driver, this);}

    @FindBy (name = "p")
    WebElement newsSearchBox;

    @FindBy (id = "search-button")
    WebElement NewsSearchButton;

    public void inputSearchText (String newsTextBoxSearch){
        wdwait.until(ExpectedConditions.visibilityOf(newsSearchBox));
        newsSearchBox.clear();
        newsSearchBox.sendKeys(newsTextBoxSearch);
    }

    public void clickSearchBtn (){
        wdwait.until(ExpectedConditions.visibilityOf(NewsSearchButton));
        NewsSearchButton.click();
    }


}
