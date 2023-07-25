package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public static final String BASE_URL = "https://ap12.lightning.force.com/";
    public static final By NEW_BUTTON = By.xpath("//div[@title = 'New']");
    public static final By ACCOUNT_SAVE_BUTTON = By.xpath("//button[@title='Save']");
    public static final By CONTACT_SAVE_BUTTON = By.xpath("//button[contains(@class,'slds-button_brand')]");


    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public String waitAndGetText(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }
    public abstract boolean isPageOpen();

    public boolean isExist(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
}
}