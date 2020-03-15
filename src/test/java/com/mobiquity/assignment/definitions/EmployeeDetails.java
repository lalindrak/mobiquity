package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.data.Data;
import com.mobiquity.assignment.pages.EmployeeDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class EmployeeDetails {

    EmployeeDetailsPage employeeDetailsPage = new EmployeeDetailsPage();
    private Data data;

    public EmployeeDetails(Data data) {
        this.data = data;
    }

    @Then("^User is successfully logged into the system$")
    public void userIsSuccessfullyLoggedIntoTheSystem() {
        Assert.assertEquals(employeeDetailsPage.verifyPageURL(), true);
        Assert.assertEquals(employeeDetailsPage.verifyLoggedInUser(data.getUsername()), true);
    }

    @And("^User clicks on Logout button$")
    public void userClicksOnLogoutButton() {
        employeeDetailsPage.clickLogoutButton();
    }


    @Given("^User clicks on the Create button$")
    public void userClicksOnTheCreateButton() {
        employeeDetailsPage.clickCreateButton();
    }

    @Then("^New employee record is added to the system$")
    public void newEmployeeRecordIsAddedToTheSystem() {
        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), true);
    }

    @Then("^New employee record should should not be added the system$")
    public void newEmployeeRecordShouldShouldNotBeAddedTheSystem() {
        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), false);
    }

    @Given("^User click on the employee name from the employee list$")
    public void userClickOnTheEmployeeNameFromTheEmployeeList() {
        employeeDetailsPage.clickOnEmployeeRecord(data.getFirstName()+ " " + data.getLastName());
        employeeDetailsPage.clickOnEditButton();
    }

    @Then("^Updated information should be displayed in the system$")
    public void updatedInformationShouldBeDisplayedInTheSystem() {
        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), true);
    }

    @Given("^User double click on the employee name from the employee list$")
    public void userDoubleClickOnTheEmployeeNameFromTheEmployeeList() {
        employeeDetailsPage.doubleClickOnEmployeeRecord(data.getFirstName()+ " " + data.getLastName());
    }
}
