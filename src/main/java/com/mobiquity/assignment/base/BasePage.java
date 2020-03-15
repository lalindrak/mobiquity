package com.mobiquity.assignment.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;

    public void setWebDriver(WebDriver driver){
        BasePage.driver= driver;
    }
    public String getPageURL(){return driver.getCurrentUrl();}

    public void wait(int seconds){
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

//    public void waitTillElementVisible(WebElement element, int seconds){
//        WebDriverWait wait = new WebDriverWait(driver, seconds);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}
