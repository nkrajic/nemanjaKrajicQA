package page;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class comtradeSporetiPage extends baseTestComtrade {
    public comtradeSporetiPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//span[contains(text(),\"Kombinovani šporeti\")]")
    WebElement kombSporLocator;


    public void clikKombinovaniSporeti(){
        wdwait.until(ExpectedConditions.visibilityOf(kombSporLocator));
        kombSporLocator.click();
    }

}
