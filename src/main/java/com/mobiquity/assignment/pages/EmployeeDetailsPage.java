package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeeDetailsPage extends BasePage {
    Logger log = LoggerUtil.getLogger(LoginPage.class);

    private static final String logoutButton  = "//p[@class='main-button']";

    private static final String greetingsUser  = "//p[@id='greetings']";
    public boolean verifyPageURL(){
        wait(2);
        String employeePageURL = getPageURL();
        if(!employeePageURL.contains("/login")){
            return true;
        }
        else
            return false;
    }

    public boolean verifyLoggedInUser(String username){
        if(username.equals(driver.findElement(By.xpath(greetingsUser)).getText().split(" ")[1].trim())){
            return true;
        }
        else
            return false;
    }
    public void clickLogoutButton(){
        driver.findElement(By.xpath(logoutButton)).click();
    }


}
