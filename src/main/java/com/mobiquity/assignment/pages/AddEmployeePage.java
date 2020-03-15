package com.mobiquity.assignment.pages;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.helper.LoggerUtil;
import cucumber.api.DataTable;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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
                    result.sendKeys(email);
                } else if (result.getAttribute("ng-model").equals("selectedEmployee.startDate")) {
                    currentDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
                    result.sendKeys(currentDate);
                } else if (result.getAttribute("type").equals("text")) {
                    result.sendKeys(dataEmployee.get(i).get(1).concat("" + System.currentTimeMillis()));
                }
                i++;
            }
        }
    }
//    public boolean assertUserInputs(DataTable employee){
//        String email;
//        String currentDate;
//        List<List<String>> dataEmployee = employee.raw();
//        for (int i = 1; i < dataEmployee.size(); i++) {
//
//            List<WebElement> fieldValues = driver.findElements(By.xpath(inputFields));
//            for (WebElement result : fieldValues) {
//                if (result.getAttribute("type").equals("email")) {
//                    if(!dataEmployee.get(i).get(1).contains("@")){
//                        return false;
//                    }
//                    else
//                        email = dataEmployee.get(i).get(1).replaceAll("@", addRandomStringToEmail());
//                        result.sendKeys(email);
//
//                } else if (result.getAttribute("ng-model").equals("selectedEmployee.startDate")) {
//
//                    SimpleDateFormat correctDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                    if(!dataEmployee.get(i).get(1).matches("^\\d{4}-\\d{2}-\\d{2}$")){
//                        return false;
//                    }
//                    else
//                        currentDate = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
//                        result.sendKeys(currentDate);
//
//                } else if (result.getAttribute("type").equals("text")) {
//
//                    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
//                    Matcher m = p.matcher(dataEmployee.get(i).get(1));
//                    boolean b = m.find();
//                    if(dataEmployee.get(i).get(1).isEmpty() || dataEmployee.get(i).get(1).contains(m.toString())){
//                        return false;
//                    }
//                    else
//                        result.sendKeys(dataEmployee.get(i).get(1).concat("_" + System.currentTimeMillis()));
//                }
//                i++;
//            }
//        }
//        return false;
//
//    }

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
        wait(1);
    }

    public void clickCancel() {
        driver.findElement(By.xpath(cancelButton)).click();
        wait(1);
    }
}
