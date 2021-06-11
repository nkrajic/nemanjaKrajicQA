package page;

import base.baseTestComtrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class comtradeProductFss54010dwPage extends baseTestComtrade {
    public comtradeProductFss54010dwPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//td[contains(text(),\"Bela\")]")
    WebElement colorBekoProduct;

    @FindBy(linkText = "Ocene")
    WebElement btnOcene;

    @FindBy(xpath = "//strong[contains(text(),\"Beko kombinovani sporet\")]")
    WebElement milankaTitleComment;

    @FindBy(xpath = "//p[contains(text(),\"Kupili smo ovaj beko sporet,jer moze i plin\")]" )
    WebElement milankaComment;

    public String colorBekoProductCheck(){
        wdwait.until(ExpectedConditions.visibilityOf(colorBekoProduct));
        return colorBekoProduct.getText();
    }


    public void clikOnOcene(){
        wdwait.until(ExpectedConditions.visibilityOf(btnOcene));
        btnOcene.click();
    }
    public String verifyCommentTitle(){
        wdwait.until(ExpectedConditions.visibilityOf(milankaTitleComment));
        return milankaTitleComment.getText();
    }
    public String verifyCommentMilanka(){
        wdwait.until(ExpectedConditions.visibilityOf(milankaComment));
        return milankaComment.getText();
        }

}
