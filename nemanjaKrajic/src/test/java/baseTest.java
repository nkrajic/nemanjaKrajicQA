import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {

    // deklarisanje promenjive driver
    public static WebDriver driver;
    //deklarisanje promenjive wdwait za cekanje
    public static WebDriverWait wdwait;


    // izvrsava se pre testa vise kao setUp
    @Before
    //metoda koja se setupuje
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        wdwait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown(){
       // zatvaranje taba
        //driver.close();
        //zatvaranje pretrazivaca
        //driver.quit();

    }

    @Test
    public void firstTest(){
        driver.get("https://www.yahoo.com/");
        //manage je browser moze se koristiti za tabove,fullscreen minimize,maximize itd
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();


    }

    // obavezno ocistiti polja pre nego sto se bilo sta upise u polje
    @Test
    public void secondTest(){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Beograd");
        //Keys je biblioteka za dugmad ENTER ALT DELETE ITD. sendKeys(Keys.NESTO VELIKIM SLOVIMA);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.navigate().back();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Nis");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Test
    public void googleTest (){
        //
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Ada ciganlija");
        driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
        //driver.findElement(By.xpath("(//input[@name=\"bntK\"]")[2]).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        driver.navigate().back();
        driver.findElement(By.linkText("Gmail")).click();

    }
    @Test
    public void googleTest2 (){
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Ada ciganlija");
        //staticko cekanje ovo se ne koristi
        //Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
        //driver.findElement(By.xpath("(//input[@name=\"bntK\"]")[2]).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Gmail")).click();

    }


}
