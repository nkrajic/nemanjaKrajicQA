package page;

import base.baseTestComtrade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class comtradeKombinovaniSporetiPage extends baseTestComtrade {
    public comtradeKombinovaniSporetiPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//label[contains(text(),\"Gorenje\")]")
    WebElement fltGorenje;

    @FindBy (xpath = "//a[contains(text(),\"Gorenje K5111SG kombinovani šporet\")]")
    WebElement gorenjeProductK5111sg;

    @FindBy (linkText = "Poništi sve filtere")
    WebElement ponistavanjeFiltera;

    @FindBy (xpath = "//label[contains(text(),\"Beko\")]")
    WebElement fltBeko;

    @FindBy (xpath = "//a[contains(text(),\"FSS54010DW kombinovani šporet\")]")
    WebElement bekoProductFss54010dw;


    public void clikOnFltGorenje(){
        wdwait.until(ExpectedConditions.visibilityOf(fltGorenje));
        fltGorenje.click();
    }
    public void product5111sg(){
        wdwait.until(ExpectedConditions.visibilityOf(gorenjeProductK5111sg));
        gorenjeProductK5111sg.click();
    }
    public void allFilterDeselect(){
        wdwait.until(ExpectedConditions.visibilityOf(ponistavanjeFiltera));
        ponistavanjeFiltera.click();
    }
    public void clickOnFltBeko(){
        wdwait.until(ExpectedConditions.visibilityOf(fltBeko));
        fltBeko.click();
    }
    public void productFss54010dw(){
        wdwait.until(ExpectedConditions.visibilityOf(bekoProductFss54010dw));

        bekoProductFss54010dw.click();
    }


}
