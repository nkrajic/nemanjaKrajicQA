package test;

import base.baseTestYahoo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class yahooSearchTest extends baseTestYahoo {
    googleSearchPage GoogleSearchPage;
    googleSearchResultPage GoogleSearchResultPage;
    yahooHomePage YahooHomePage;
    yahooNewsPage YahooNewsPage;
    yahooSearchPage YahooSearchPage;


    @Before
    public void setUpPage(){
        GoogleSearchPage = new googleSearchPage();
        GoogleSearchResultPage = new googleSearchResultPage();
        YahooHomePage = new yahooHomePage();
        YahooNewsPage = new yahooNewsPage();
        YahooSearchPage = new yahooSearchPage();
    }
    @Test
    public void testingYahooAndGoogle(){
        GoogleSearchPage.inputSearchBox("yahoo");
        GoogleSearchResultPage.clickOnYahooLink();
        YahooHomePage.yahooNewaLink();
        YahooNewsPage.inputSearchText("google");
        YahooNewsPage.clickSearchBtn();
        Assert.assertTrue(YahooSearchPage.verifyTextIsDisplayed());
        Assert.assertEquals("tehnolodzi kompani", YahooSearchPage.compareText());
    }






}
