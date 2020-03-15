package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class EmployeeDetailsPage extends BasePage {
    Logger log = LoggerUtil.getLogger(LoginPage.class);


    private static final String logoutButton = "//p[@class='main-button']";
    private static final String greetingsUser = "//p[@id='greetings']";
    private static final String createButton = "//a[text()='Create']";
    private static final String employeeList = "//ul[@id='employee-list']/li";
    private static final String editButton = "//a[text()='Edit']";

    public boolean verifyPageURL() {
        wait(2);
        String employeePageURL = getPageURL();
        if (!employeePageURL.contains("/login")) {
            return true;
        } else
            return false;
    }

    public boolean verifyLoggedInUser(String username) {
        if (username.equals(driver.findElement(By.xpath(greetingsUser)).getText().split(" ")[1].trim())) {
            return true;
        } else
            return false;
    }

    public void clickLogoutButton() {
        driver.findElement(By.xpath(logoutButton)).click();
    }

    public void clickCreateButton() {
        driver.findElement(By.xpath(createButton)).click();
        wait(2);

    }

    public boolean isAddedEmployeeDisplayed(String employeeName) {
        List<WebElement> listEmployee = driver.findElements(By.xpath(employeeList));
        for (WebElement employee : listEmployee) {
            if (employee.getText().trim().equals(employeeName)) {
                return true;
            }
        }
        log.error("Added employee is not found in the employee list");
        return false;
    }

    public void clickOnEmployeeRecord(String employeeName){
        List<WebElement> listEmployee = driver.findElements(By.xpath(employeeList));
        for (WebElement employee : listEmployee) {
            if (employee.getText().trim().equals(employeeName)) {
                employee.click();
            }
        }
    }
    public void clickOnEditButton(){
        driver.findElement(By.xpath(editButton)).click();
        wait(2);
    }
    public void doubleClickOnEmployeeRecord(String employeeName){
        List<WebElement> listEmployee = driver.findElements(By.xpath(employeeList));
        for (WebElement employee : listEmployee) {
            if (employee.getText().trim().equals(employeeName)) {
                wait(1);
                doubleClick(employee);
                wait(1);
            }
        }
    }
}
