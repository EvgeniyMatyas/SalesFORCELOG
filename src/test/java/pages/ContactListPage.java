package test.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage{
    public static final By BREADCRUMB_LABEL =By.xpath("//div[contains(@class, 'slds-breadcrumb')]//span[text() ='Contacts']");
    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открываем страницу контактов")
    public ContactListPage openContactPage(){
        driver.get(BASE_URL + "lightning/o/Contact/list");
        return this;
    }

    @Step("Нажимаем на кнопку New")
    public ContactModalPage clickNewButton(){
        driver.findElement(NEW_BUTTON).click();
        return new ContactModalPage(driver);
    }


    @Override
    public boolean isPageOpen() {
        return  isExist(BREADCRUMB_LABEL);
    }
}
