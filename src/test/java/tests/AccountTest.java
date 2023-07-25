package test.java.tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {
    @Test(description = "Проверка поля Account с валидными данными")
    public void accountShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("oxodpub-cnkg@force.com","123456789J")
                .clickLogInButton();
        accountListPage.openAccountPage()
                .clickNewButton();
        Account account = AccountFactory.get();
        accountModalPage.create(account);
        accountDetailsPage.isPageOpen();



        assertEquals(accountDetailsPage.getNotificationText(), "Account \""+ account.getAccountName() +"\" was created.");

    }
}

