package page;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class comtradeCreatePage extends baseTestComtrade {
    public comtradeCreatePage(){
        PageFactory.initElements(driver, this);
    }

    Actions hover = new Actions(driver);



    @FindBy (css = "a.soundest-form-background-image-close ")
    WebElement popUpOne;

//    @FindBy (className = "ub-emb-close")
//    WebElement popUpTwo;

    @FindBy (xpath = "//button[contains(text(),\"Prihvatam\")]")
    WebElement footerBanner;

    @FindBy (css = ".am-opener.sharkskin-collapse")
    WebElement allProductHover;

    @FindBy (linkText = "Bela tehnika")
    WebElement belaTehnikaLocator;

    @FindBy (xpath = "//a[contains(text(),\"Šporeti\")]")
    WebElement sporetiLocator;


    public void killPopUpOne (){
        wdwait.until(ExpectedConditions.visibilityOf(popUpOne));
        popUpOne.click();
    }
//    public void killPopUpTwo (){
//        wdwait.until(ExpectedConditions.visibilityOf(popUpTwo));
//        popUpTwo.click();
//    }
    public void killFooterBanner(){
        wdwait.until(ExpectedConditions.visibilityOf(footerBanner));
        footerBanner.click();
    }

    public void hoverOnAllProduct(){
        wdwait.until(ExpectedConditions.visibilityOf(allProductHover));
        hover.moveToElement(allProductHover).perform();
    }
    public void hoverOnBelaTehnika(){
        wdwait.until(ExpectedConditions.visibilityOf(belaTehnikaLocator));
        hover.moveToElement(belaTehnikaLocator).perform();
    }

    public void clickOnSporeti(){
        wdwait.until(ExpectedConditions.visibilityOf(sporetiLocator));
        sporetiLocator.click();
    }




}
