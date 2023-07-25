package test.java.tests;

import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

@Test(description = "Проверка логина с валидными данными")
@Description("Test descr")
@Issue("B1234")
@TmsLink("case123j")
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("oxodpub-cnkg@force.com","123456789J")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
