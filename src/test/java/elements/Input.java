package test.java.elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j2

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input | //label[text()='%s']/ancestor::div[contains(@part,'input-text')]//input";
    String inputLocatorBirthDay = "//label[text()='%s']/ancestor::div[contains(@class,'slds-dropdown-trigger')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label,this.label))).clear();
        log.info("Clear input with label  " + this.label);
        driver.findElement(By.xpath(String.format(inputLocator,this.label,this.label))).sendKeys(text);
        log.info("Wtite into input with label " + this.label + "text: " + text);
    }
    public void writeBirthDate(String text){
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay,this.label,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay,this.label,this.label))).sendKeys(text);

    }

}