package test.java.pages;


import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j2

public class LoginPage extends BasePage{

    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOG_IN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открываем сайт")
    public LoginPage openSaleForce(){
        driver.get(BASE_URL);
        log.info("Open site with URL: " + BASE_URL);
        return this;

    }

    @Step("Вводим логин: '{name}' и пароль: '{password}'")
    public LoginPage loginAndPassword(String name,String password) {
        driver.findElement(USER_NAME).sendKeys(name);
        log.info("ВВести в поле ЮЗЕРНЕЙМ: " + name);
        driver.findElement(PASSWORD).sendKeys(password);
        log.info("Input password: " + password);
        return this;
    }

    @Step("Кликаем по кнопке LoginButton")
    public HomePage clickLogInButton(){
        driver.findElement(LOG_IN_BUTTON).click();
        log.info("click on loginbutton with XPath: " + LOG_IN_BUTTON);
        return new HomePage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOG_IN_BUTTON);
    }

}
