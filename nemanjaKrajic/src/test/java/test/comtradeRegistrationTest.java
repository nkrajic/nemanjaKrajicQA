package test;

import base.baseTest;
import org.junit.Before;
import org.junit.Test;
import page.comtradeCreateAccountPage;

public class comtradeRegistrationTest extends baseTest {
    //ComtradeCreateAccountPage klasa gde su elementi i metode
    comtradeCreateAccountPage ComtradeCreateAccountPage;
    // ovde nasoj promenjivoj dodajemo instancu objekra klase gde su svi elementi i metode
    // ime merode u @Before ne sme da se zove isto kao i ime metode u @Before  u baseTest clasi
    @Before
    public void setUpPage(){
        ComtradeCreateAccountPage = new comtradeCreateAccountPage();
    }
    @Test
    public void successfulRegistrationTest(){
        ComtradeCreateAccountPage.inputNameField("nekoIme");
        ComtradeCreateAccountPage.inputLastNameField("nekoPrezime");
        ComtradeCreateAccountPage.inputEmailField("nekiEmail@email.com");
        ComtradeCreateAccountPage.clickNewLetterCheckbox();
        ComtradeCreateAccountPage.inputPasswordField("12345678");
        ComtradeCreateAccountPage.inputConfirmPasswordField("12345678");
        ComtradeCreateAccountPage.clickSendButton();
    }



}
