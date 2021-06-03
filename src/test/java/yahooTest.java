import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yahooTest {

    public static WebDriver driver;
    //deklarisanje promenjive za cekanje
    public static WebDriverWait wdwait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown() {
        //driver.close();
    }

    //prvo uvek cekati element
    @Test
    public void zadatakYahoo(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("yahoo");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(),\"Yahoo | Mail\")]")));
        driver.findElement(By.xpath("//h3[contains(text(),\"Yahoo | Mail\")]")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("News")));
        driver.findElement(By.linkText("News")).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.name("p")));
        driver.findElement(By.name("p")).clear();
        driver.findElement(By.name("p")).sendKeys("google");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("search-button")));
        driver.findElement(By.id("search-button")).click();
        //cekanje elementa koji trazimo
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fw-n.lh-xs.fz-14")));
        //provera texta na stranici da li je prikazan
        Assert.assertTrue(driver.findElement(By.cssSelector(".fw-n.lh-xs.fz-14")).isDisplayed());
        //uporedjicanje teksta na stranici expected je text koji trazimo a uporedjujemo ga sa lokatorom driver.findElement(By.cssSelector(".fw-n.lh-xs.fz-14")).getText());
        Assert.assertEquals("tehnolodzi kompani", driver.findElement(By.cssSelector(".fw-n.lh-xs.fz-14")).getText());
    }

}