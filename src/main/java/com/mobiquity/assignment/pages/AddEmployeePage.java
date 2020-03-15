package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import cucumber.api.DataTable;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddEmployeePage extends BasePage {
    Logger log = LoggerUtil.getLogger(AddEmployeePage.class);

    private static final String firstNameInput = "//span[contains(text(),'First')]/../input";
    private static final String lastNameInput = "//span[contains(text(),'Last')]/../input";
    private static final String startDateInput = "//span[contains(text(),'Start')]/../input";
    private static final String emailInput = "//span[contains(text(),'Email')]/../input";
    private static final String submitButton = "//button[text()='Add']";
    private static final String cancelButton = "//a[text()='Cancel']";
    private static final String inputFields = "//input";
    private static final String updateButton = "//button[text()='Update']";
    private static final String backButton = "//a[text()='Back']";
    public boolean verifyPageURL() {
        wait(2);
        String employeePageURL = getPageURL();
        if (employeePageURL.contains("/employees/new")) {
            return true;
        } else
            return false;
    }

    public void fillEmployeeInformation(DataTable employee) {
        String email;
        String currentDate;
        List<List<String>> dataEmployee = employee.raw();
        for (int i = 1; i < dataEmployee.size(); i++) {
            List<WebElement> fieldValues = driver.findElements(By.xpath(inputFields));
            for (WebElement result : fieldValues) {
                if (result.getAttribute("type").equals("email")) {
                    email = dataEmployee.get(i).get(1).replaceAll("@", addRandomStringToEmail());
                    result.clear();
                    result.sendKeys(email);
                } else if (result.getAttribute("ng-model").equals("selectedEmployee.startDate")) {
                    currentDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
                    result.clear();
                    result.sendKeys(currentDate);
                } else if (result.getAttribute("type").equals("text")) {
                    result.clear();
                    result.sendKeys(dataEmployee.get(i).get(1).concat("" + System.currentTimeMillis()));
                }
                i++;
            }
        }
    }

    public boolean assertFirstName() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(getFirstName());
        boolean specialCharactersExists = m.find();
        if (specialCharactersExists) {
            return false;
        } else
            return true;

    }

    public boolean assertLastName() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(getLastName());
        boolean specialCharactersExists = m.find();
        if (specialCharactersExists) {
            return false;
        }
        return
                true;
    }

    public boolean assertStartDate() {
        if (getStartDate().matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            return true;
        } else
            return false;
    }

    public boolean assertEmail() {
        if (getEmail().contains("@") && !getEmail().equals("")) {
            return true;
        } else
            return false;
    }


    public String addRandomStringToEmail() {
        String randomString = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return "+" + randomString.concat("@");
    }

    public String getFirstName() {
        return driver.findElement(By.xpath(firstNameInput)).getAttribute("value");
    }

    public String getLastName() {
        return driver.findElement(By.xpath(lastNameInput)).getAttribute("value");
    }

    public String getStartDate() {
        return driver.findElement(By.xpath(startDateInput)).getAttribute("value");
    }

    public String getEmail() {
        return driver.findElement(By.xpath(emailInput)).getAttribute("value");
    }

    public void clickSubmit() {
        driver.findElement(By.xpath(submitButton)).click();
        wait(2);
    }

    public void clickCancel() {
        driver.findElement(By.xpath(cancelButton)).click();
        wait(1);
    }
    public void clickUpdate(){
        driver.findElement(By.xpath(updateButton)).click();
        wait(2);
    }
    public void clickBackButton(){
        driver.findElement(By.xpath(backButton)).click();
        wait(2);
    }
}
