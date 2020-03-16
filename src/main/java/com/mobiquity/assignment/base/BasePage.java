package com.mobiquity.assignment.base;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {

    private static final int SECONDS = 2;
    protected static WebDriver driver;

    public void setWebDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    public void doubleClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }


    public void waitTillElementVisible(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitTillElementVisible(List<WebElement> webElements, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        for(WebElement singleElement : webElements){
            wait.until(ExpectedConditions.visibilityOf(singleElement));
            break;
        }
    }

}
