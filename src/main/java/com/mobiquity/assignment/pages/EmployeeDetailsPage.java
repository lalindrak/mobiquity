package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmployeeDetailsPage extends BasePage {
    Logger log = LoggerUtil.getLogger(LoginPage.class);


    private static final String logoutButton = "//p[@class='main-button']";
    private static final String greetingsUser = "//p[@id='greetings']";
    private static final String createButton = "//a[text()='Create']";
    private static final String employeeList = "//ul[@id='employee-list']/li";

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
        wait(1);

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
}
