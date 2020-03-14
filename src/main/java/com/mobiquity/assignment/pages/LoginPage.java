package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    Logger log = LoggerUtil.getLogger(LoginPage.class);

    private static final String usernameInput  = "//input[@type='text']";
    private static final String passwordInput = "//input[@type='password']";
    private static final String submitButton = "//button[@type='submit']";
    private static final String errorMessage = "//p[contains(@class,'error')]";

    public void enterUsername(String username){
        driver.findElement(By.xpath(usernameInput)).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(By.xpath(passwordInput)).sendKeys(password);
    }
    public void clickSubmitButton(String value){
        if(value.equalsIgnoreCase("Submit")){
            driver.findElement(By.xpath(submitButton)).click();
        }
        else if(value.equalsIgnoreCase("Enter")){
            driver.findElement(By.xpath(submitButton)).sendKeys(Keys.ENTER);
        }
        else
            log.error("Cannot click on Submit button");
    }
    public boolean verifyErrorMessage(String error){
        WebElement eleMessage = driver.findElement(By.xpath(errorMessage));
        waitTillElementVisible(eleMessage,2);

        if(eleMessage.getText().trim().equals(error)){
            return true;
        }
        else
            return false;
    }
    public boolean verifyPageURL(){
        wait(2);
        String employeePageURL = getPageURL();
        if(employeePageURL.contains("/login")){
            return true;
        }
        else
            return false;
    }
    public boolean verifyInputFieldsAreBlank(){
        if(driver.findElement(By.xpath(usernameInput)).getText().isEmpty() && driver.findElement(By.xpath(passwordInput)).getAttribute("value").isEmpty()){
            return true;
        }
        else
            log.error("Input fields are not empty after logging out from the system");
            return false;

    }

}