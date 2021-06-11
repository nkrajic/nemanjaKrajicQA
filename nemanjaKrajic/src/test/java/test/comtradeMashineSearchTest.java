package test;

import base.baseTestComtrade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class comtradeMashineSearchTest extends baseTestComtrade {

    comtradeCreatePage ComtradeCreatePage;
    comtradeSporetiPage ComtradeSporetiPage;
    comtradeKombinovaniSporetiPage ComtradeKombinovaniSporetiPage;
    comtradeProduct5111sgPage ComtradeProduct5111sgPage;
    comtradeProductFss54010dwPage ComtradeProductFss54010dwPage;


    @Before
    public void setUpPage(){

        ComtradeCreatePage = new comtradeCreatePage();
        ComtradeSporetiPage = new comtradeSporetiPage();
        ComtradeKombinovaniSporetiPage = new comtradeKombinovaniSporetiPage();
        ComtradeProduct5111sgPage = new comtradeProduct5111sgPage();
        ComtradeProductFss54010dwPage = new comtradeProductFss54010dwPage();

    }


    @Test
    public  void searchForMashine(){
        ComtradeCreatePage.killPopUpOne();
        //ComtradeCreatePage.killPopUpTwo();
        ComtradeCreatePage.killFooterBanner();
        ComtradeCreatePage.hoverOnAllProduct();
        ComtradeCreatePage.hoverOnBelaTehnika();
        ComtradeCreatePage.clickOnSporeti();
        ComtradeCreatePage.killFooterBanner();
        ComtradeSporetiPage.clikKombinovaniSporeti();
        ComtradeKombinovaniSporetiPage.clikOnFltGorenje();
        ComtradeKombinovaniSporetiPage.product5111sg();
        Assert.assertTrue(ComtradeProduct5111sgPage.tenProcentVisibility());
        driver.navigate().back();
        ComtradeKombinovaniSporetiPage.allFilterDeselect();
        ComtradeKombinovaniSporetiPage.clickOnFltBeko();
        ComtradeKombinovaniSporetiPage.productFss54010dw();
        Assert.assertEquals("Bela", ComtradeProductFss54010dwPage.colorBekoProductCheck());
        ComtradeProductFss54010dwPage.clikOnOcene();
        Assert.assertEquals("Beko kombinovani sporet", ComtradeProductFss54010dwPage.verifyCommentTitle());
        Assert.assertEquals("Kupili smo ovaj beko sporet,jer moze i plin i " +
                "struja,nije skup,rerna savrseno pece,ringle brzo zagrevaju. Lak je za " +
                "iscenje,nije potrosac veliki. Nismo se pokajali sto smo ga kupili.", ComtradeProductFss54010dwPage.verifyCommentMilanka());


    }

}
