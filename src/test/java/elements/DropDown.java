package test.java.elements;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
@Log4j2

public class DropDown {
    String dropDownLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInputSelect')]//div[@class='uiMenu'] | //label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//input | //label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//button[contains(@class,'slds-combobox__input')]";
    String optionLocator = "//div[contains(@class, 'visible')]//a[text() = '%s'] | //span[text()='%s']/ancestor::li[contains(@class,'slds-listbox__item')]//lightning-base-combobox-item | //lightning-base-combobox-item[contains(@class, 'slds-media')]//span[text() = '%s']";
    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOption(String option){
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label,this.label,this.label))).click();
        log.info("Click on dropdown with label " + this.label);
        driver.findElement(By.xpath(String.format(optionLocator,option,option,option))).click();
        log.info("Select option " + option);
    }
}
