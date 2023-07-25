package test.java.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textAreaLocator = "//span[text()='%s']/ancestor::div[contains(@class,'textarea')]//textarea | //label[text()='%s']/ancestor::div[contains(@class,'slds-form-element__row')]//textarea";
    String contactDescriptionTextAreaLocator = "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid slds-size_1-of-1')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(textAreaLocator,this.label,this.label))).clear();
        driver.findElement(By.xpath(String.format(textAreaLocator,this.label,this.label))).sendKeys(text);
    }
    public void writeContactDescription(String text){
        driver.findElement(By.xpath(String.format(contactDescriptionTextAreaLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(contactDescriptionTextAreaLocator,this.label))).sendKeys(text);
    }
}
