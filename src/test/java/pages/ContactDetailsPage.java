package test.java.pages;

import models.Account;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";

    public static final By DETAILS_LINK = By.xpath("//a[@data-label='Details']");

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }
    public String getFieldValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }
    public String getAccountName(Contact contact){
        return "Open "+contact.getAccountName()+" Preview";
    }
    public String getName(Contact contact){
        return contact.getSalutation()+" "+contact.getFirstName()+" "+contact.getLastName();
    }
    public String getMailingAddress(Contact contact){
        return contact.getMailingStreet()+"\n"+ contact.getMailingCity() +", "+contact.getMailingState_Province()+" "+contact.getMailingZip_PostalCode()+"\n"+ contact.getMailingCountry();
    }
    public String getOtherAddress(Contact contact){
        return contact.getOtherStreet()+"\n"+ contact.getOtherCity() +", "+contact.getOtherState_Province()+" "+contact.getOtherZip_PostalCode()+"\n"+ contact.getOtherCountry();
    }
    @Override
    public boolean isPageOpen() {
            return isExist(DETAILS_LINK);
    }
}
