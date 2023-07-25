package test.java.pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class AccountDetailsPage extends BasePage{
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";
    public static final By NOTIFICATION =By.xpath( "//span[contains(@class, 'toastMessage')]");


    public static final By DETAILS_LINK = By.xpath("//a[@data-label='Details']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
    public String getFieldValue(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValue,fieldName))).getText();
    }
    public String getBillingAddress(Account account){
        return account.getBillingStreet()+"\n"+ account.getBillingCity() +", "+account.getBillingState_Province()+" "+account.getBillingZip_PostalCode()+"\n"+ account.getBillingCountry();
    }

    public String getShippingAddress(Account account){
        return account.getShippingStreet()+"\n"+ account.getShippingCity() +", "+account.getShippingState_Province()+" "+account.getShippingZip_PostalCode()+"\n"+ account.getShippingCountry();
    }

    public  String getNotificationText(){
       return waitAndGetText(NOTIFICATION);
    }



    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }
}
