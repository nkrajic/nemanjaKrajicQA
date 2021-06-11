package page;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class comtradeProduct5111sgPage extends baseTestComtrade {
    public comtradeProduct5111sgPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".special-price > .discount.pull-left")
    WebElement discountVisibility;

public boolean tenProcentVisibility(){
    wdwait.until(ExpectedConditions.visibilityOf(discountVisibility));
        return discountVisibility.isDisplayed();
}


}
