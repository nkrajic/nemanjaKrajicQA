import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class comtradeTest {

    public static WebDriver driver;
    //deklarisanje promenjive za cekanje
    public static WebDriverWait wdwait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://www.ctshop.rs/customer/account/create");
    }

    @After
    public void tearDown() {
        //driver.close();
    }

    @Test
    public void registracijaKorisnika() {
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Petar");
        driver.findElement(By.className("ub-emb-close")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.soundest-form-background-image-close ")));
        driver.findElement(By.cssSelector("a.soundest-form-background-image-close ")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Perovic");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.id("email_address")).clear();
        driver.findElement(By.id("email_address")).sendKeys("petar@perovic.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("petar");
        driver.findElement(By.id("confirmation")).clear();
        driver.findElement(By.id("confirmation")).sendKeys("petar");
        driver.findElement(By.xpath("//span[contains(text(),\"Pošalji\")]")).click();

    }

    @Test
    public void DrugaRegistracijaKorisnika() {
        driver.findElement(By.className("ub-emb-close")).click();
        driver.findElement(By.className("soundest-form-background-image-close")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).clear();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Pera");
        driver.findElement(By.xpath("//input[@id='lastname']")).clear();
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Peric");
        driver.findElement(By.xpath("//input[@id='email_address']")).clear();
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("pera@peric.peca");
        //if petlja koja proverava da li je checkbox stikliran
        if (driver.findElement(By.xpath("//input[@id='is_subscribed']")).isSelected()) {
            //ako nije klikni
            driver.findElement(By.xpath("//input[@id='is_subscribed']")).click();
        }
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("peraperic");
        driver.findElement(By.xpath("//input[@id='confirmation']")).clear();
        driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("peraperic");
        driver.findElement(By.xpath("//span[contains(text(),\"Pošalji\")]")).click();
    }

    @Test
    public void selectDropDown() {
        //select openqa promenjiva
        Select pravnoLice = new Select(driver.findElement(By.id("pravnolice")));
        pravnoLice.selectByVisibleText("Da");
        //moze by visible text ili value
        //pravnoLice.selectByValue("1");
    }

    @Test
    public void registracijaPravnogLica() {

        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("ub-emb-close")));
        driver.findElement(By.className("ub-emb-close")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.soundest-form-background-image-close ")));
        driver.findElement(By.cssSelector("a.soundest-form-background-image-close ")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),\"Prihvatam\")]")));
        driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("test1");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastname")));
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("test1");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("email_address")));
        driver.findElement(By.id("email_address")).clear();
        driver.findElement(By.id("email_address")).sendKeys("test123455@test.com");
        if (driver.findElement(By.xpath("//input[@id='is_subscribed']")).isSelected()) {
            //ako nije klikni
            driver.findElement(By.xpath("//input[@id='is_subscribed']")).click();
        }
        Select pravnoLice = new Select(driver.findElement(By.id("pravnolice")));
        pravnoLice.selectByVisibleText("Da");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("firma")));
        driver.findElement(By.id("firma")).clear();
        driver.findElement(By.id("firma")).sendKeys("Test123");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("pib")));
        driver.findElement(By.id("pib")).clear();
        driver.findElement(By.id("pib")).sendKeys("c012345678");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("confirmation")));
        driver.findElement(By.id("confirmation")).clear();
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),\"Pošalji\")]")));
        driver.findElement(By.xpath("//span[contains(text(),\"Pošalji\")]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-warning")).isDisplayed());
        //Assert.assertEquals("PIB mora sadržati tačno 9 cifara!", driver.findElement(By.cssSelector(".alert.alert-warning")).getText());
        //Assert.assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.", driver.findElement(By.cssSelector(".alert.alert-success")).getText());
        //validiranje url da li nije jednako
        //Assert.assertNotEquals("URL", driver.getCurrentUrl());
        Assert.assertTrue(driver.findElements(By.cssSelector(".alert.alert-success")).isEmpty());
//        //kreiramo listu pod imenom successToast i koristimo findElements
//        List successToast = driver.findElements(By.cssSelector(".alert.alert-success"));
//        Assert.assertTrue(successToast.isEmpty());
        //drugi nacin
       // Assert.assertTrue(driver.findElements(By.cssSelector(".alert.alert-success")).size() == 0);


        
    }

    //hoverovanje necega na stranici
    @Test
    public void hoverTest() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("ub-emb-close")));
        driver.findElement(By.className("ub-emb-close")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.soundest-form-background-image-close ")));
        driver.findElement(By.cssSelector("a.soundest-form-background-image-close ")).click();
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(By.cssSelector(".am-opener.sharkskin-collapse"))).perform();
    }

    @Test
    public void hoverDomaci() {
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("ub-emb-close")));
        driver.findElement(By.className("ub-emb-close")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.soundest-form-background-image-close ")));
        driver.findElement(By.cssSelector("a.soundest-form-background-image-close ")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),\"Prihvatam\")]")));
        driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]")).click();
        Actions hover = new Actions(driver);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".am-opener.sharkskin-collapse")));
        hover.moveToElement(driver.findElement(By.cssSelector(".am-opener.sharkskin-collapse"))).perform();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Bela tehnika")));
        hover.moveToElement(driver.findElement(By.linkText("Bela tehnika"))).perform();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),\"Šporeti\")]")));
        driver.findElement(By.xpath("//a[contains(text(),\"Šporeti\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Kombinovani šporeti')]")));
        driver.findElement(By.xpath("//span[contains(text(),\"Kombinovani šporeti\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[contains(text(),\"Gorenje\")]")));
        driver.findElement(By.xpath("//label[contains(text(),\"Gorenje\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("button.ub-emb-close")));
        driver.findElement(By.cssSelector("button.ub-emb-close")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),\"Prihvatam\")]")));
        driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),\"Gorenje K5111SG kombinovani šporet\")]")));
        driver.findElement(By.xpath("//a[contains(text(),\"Gorenje K5111SG kombinovani šporet\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".price-cont > .price")));
        Assert.assertEquals("30.990 RSD", driver.findElement(By.cssSelector(".price-cont > .price")).getText());
        Assert.assertTrue(driver.findElement(By.cssSelector(".special-price > .discount.pull-left")).isDisplayed());
        //provera cene da li je na popustu ne znam kako da upotrebim ovu sumu kako bi proverio sa expected ne znam tacno kako da zaokruzim na ceo broj
        //double num1 = 34433, num2 = 90 , num3= 100 , sum;
        //sum = Math.ceil(num1 * num2 / num3);
        //System.out.println("Ovo je proizvod: " + (int) sum);
        //Assert.assertEquals(sum + " RSD", driver.findElement(By.cssSelector(".price-cont > .price")).getText());
        driver.navigate().back();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Poništi sve filtere")));
        driver.findElement(By.linkText("Poništi sve filtere")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[contains(text(),\"Beko\")]")));
        driver.findElement(By.xpath("//label[contains(text(),\"Beko\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),\"FSS54010DW kombinovani šporet\")]")));
        driver.findElement(By.xpath("//a[contains(text(),\"FSS54010DW kombinovani šporet\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//td[contains(text(),\"Bela\")]")));
        //sto se tice sledece linije koda radi spusta ga dole ka lokatoru za boju ali mi ne rade ostali koji se vraca gore
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//td[contains(text(),\"Bela\")]")));
        Assert.assertEquals("Bela" , driver.findElement(By.xpath("//td[contains(text(),\"Bela\")]")).getText());
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Ocene")));
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Ocene")));
        driver.findElement(By.linkText("Ocene")).click();
        //js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",driver.findElement(By.xpath("//strong[contains(text(),\"Beko kombinovani sporet\")]")));
        Assert.assertEquals("Beko kombinovani sporet" ,driver.findElement(By.xpath("//strong[contains(text(),\"Beko kombinovani sporet\")]")).getText());
        Assert.assertEquals("Kupili smo ovaj beko sporet,jer moze i plin i struja,nije skup,rerna savrseno pece,ringle brzo zagrevaju. Lak je za ciscenje,nije potrosac veliki. Nismo se pokajali sto smo ga kupili.", driver.findElement(By.xpath("//p[contains(text(),\"Kupili smo ovaj beko sporet,jer moze i plin\")]")).getText());






    }
    //VELJKOV DOMACI
    @Test
    public void homeWorkTest2(){
        driver.get("https://ctshop.rs/customer/account/create");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class=\"ub-emb-close\"]")));
        driver.findElement(By.xpath("//button[@class=\"ub-emb-close\"]")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class=\"soundest-form-background-image-close \"] ")));
        driver.findElement(By.xpath("//a[@class=\"soundest-form-background-image-close \"] ")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]")).click();
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(By.xpath("//span[@class=\"am-opener sharkskin-collapse\"]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),\"Bela tehnika\")]")));
        hover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),\"Bela tehnika\")]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),\"Šporeti\")]")));
        hover.click(driver.findElement(By.xpath("//a[contains(text(),\"Šporeti\")]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),\"Prihvatam\")]")));
        hover.click(driver.findElement(By.xpath("//button[contains(text(),\"Prihvatam\")]"))).perform();
        Dimension dim = new Dimension(1000,750);
        driver.manage().window().setSize(dim);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href=\"/kombinovani-sporeti\"]//span")));
        hover.click(driver.findElement(By.xpath("//a[@href=\"/kombinovani-sporeti\"]//span"))).perform();
        driver.manage().window().maximize();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),\"Gorenje\")]")));
        hover.click(driver.findElement(By.xpath("//label[contains(text(),\"Gorenje\")]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4//a[@href=\"/gorenje-k5111sg-kombinovani-sporet.html\"]")));
        driver.findElement(By.xpath("//h4//a[@href=\"/gorenje-k5111sg-kombinovani-sporet.html\"]")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class=\"price\"]")));
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"discount pull-left\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"price\"]")).isDisplayed());
        Assert.assertEquals("30.990 RSD" ,driver.findElement(By.xpath("//span[@class=\"price\"]")).getText());
        Assert.assertEquals("10% popust", driver.findElement(By.xpath("//span[@class=\"discount pull-left\"]")).getText());
        driver.navigate().back();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),\"Gorenje\")]")));
        hover.click(driver.findElement(By.xpath("//label[contains(text(),\"Gorenje\")]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),\"Beko\")]")));
        hover.click(driver.findElement(By.xpath("//label[contains(text(),\"Beko\")]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4//a[@href=\"/beko-fss54010dw-kombinovani-sporet.html\"]")));
        hover.click(driver.findElement(By.xpath("//h4//a[@href=\"/beko-fss54010dw-kombinovani-sporet.html\"]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody//td[contains(text(),\"Bela\")]")));
        Assert.assertTrue(driver.findElement(By.xpath("//tbody//td[contains(text(),\"Bela\")]")).isDisplayed());
        Assert.assertEquals("Bela",driver.findElement(By.xpath("//tbody//td[contains(text(),\"Bela\")]")).getText());
        hover.click(driver.findElement(By.xpath("//a[@href=\"#ocene\"]"))).perform();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class=\"review-item\"][6]")));
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class=\"review-item\"][6]//strong")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class=\"review-item\"][6]//p")).isDisplayed());
        Assert.assertEquals("Beko kombinovani sporet", driver.findElement(By.xpath("//li[@class=\"review-item\"][6]//strong")).getText());
        Assert.assertEquals("Kupili smo ovaj beko sporet,jer moze i plin i struja,nije skup,rerna savrseno pece,"+
                        "ringle brzo zagrevaju. Lak je za ciscenje,nije potrosac veliki. Nismo se pokajali sto smo ga kupili.",
                driver.findElement(By.xpath("//li[@class=\"review-item\"][6]//p")).getText());
    }



}