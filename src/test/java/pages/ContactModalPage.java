package test.java.pages;

import elements.*;
import models.Account;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage{
    public static final By NEW_CONTACT_TITLE = By.xpath("//div[contains(@class,'entityNameTitle')]");
    public ContactModalPage(WebDriver driver) {
        super(driver);
    }
    public ContactDetailsPage create(Contact contact){
        new DropDown(driver, "Account Name").selectOption(contact.getAccountName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Title").write(contact.getTitle());
        new DropDown(driver, "Salutation").selectOption(contact.getSalutation());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip_PostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState_Province());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherZip_PostalCode());
        new Input(driver, "Other State/Province").write(contact.getOtherState_Province());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsst_Phone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new DropDown(driver, "Lead Source").selectOption(contact.getLeadSource());
        new Input(driver, "Birthdate").writeBirthDate(contact.getBirthdate());
        new TextArea(driver, "Description").writeContactDescription(contact.getDescription());
        return clickSaveButton();
    }
    public ContactDetailsPage clickSaveButton(){
        driver.findElement(CONTACT_SAVE_BUTTON).click();
        return new ContactDetailsPage(driver);
    }


    @Override
    public boolean isPageOpen() {
        return isExist(NEW_CONTACT_TITLE);
    }
}
