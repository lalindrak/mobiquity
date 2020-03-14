package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.helper.LoggerUtil;
import com.mobiquity.assignment.pages.EmployeeDetailsPage;
import com.mobiquity.assignment.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class EmployeeDetails {

    EmployeeDetailsPage employeeDetailsPage = new EmployeeDetailsPage();
    Login login = new Login();

    @Then("^User is successfully logged into the system$")
    public void userIsSuccessfullyLoggedIntoTheSystem() {
        Assert.assertEquals(employeeDetailsPage.verifyPageURL(),true);
        Assert.assertEquals(employeeDetailsPage.verifyLoggedInUser("Luke"),true);
    }

    @And("^User clicks on Logout button$")
    public void userClicksOnLogoutButton() {
        employeeDetailsPage.clickLogoutButton();
    }
}
