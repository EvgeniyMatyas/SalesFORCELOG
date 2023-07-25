package test.java.pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage{
    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class,'inlineTitle')]");


    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    public AccountDetailsPage create(Account account){
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new DropDown(driver,"Type").selectOption(account.getType());
        new DropDown(driver,"Industry").selectOption(account.getIndustry());
        new TextArea(driver,"Description").write(account.getDescription());
        new TextArea(driver,"Billing Street").write(account.getBillingStreet());
        new TextArea(driver,"Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip_PostalCode());
        new Input(driver, "Billing State/Province").write(account.getBillingState_Province());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip_PostalCode());
        new Input(driver, "Shipping State/Province").write(account.getShippingState_Province());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return clickSaveButton();

    }

    public AccountDetailsPage clickSaveButton(){
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
}