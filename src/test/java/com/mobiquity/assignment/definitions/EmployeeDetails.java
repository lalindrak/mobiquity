package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.data.Data;
import com.mobiquity.assignment.pages.EmployeeDetailsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @Given("^User clicks on the employee name from the employee list$")
    public void userClickOnTheEmployeeNameFromTheEmployeeList() {
        employeeDetailsPage.clickOnEmployeeRecord(data.getFirstName()+ " " + data.getLastName());
    }

    @Then("^Updated information should be displayed in the system$")
    public void updatedInformationShouldBeDisplayedInTheSystem() {
        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), true);
    }

    @Given("^User double click on the employee name from the employee list$")
    public void userDoubleClickOnTheEmployeeNameFromTheEmployeeList() throws InterruptedException {
        employeeDetailsPage.doubleClickOnEmployeeRecord(data.getFirstName()+ " " + data.getLastName());
    }

    @When("^User clicks on Delete button$")
    public void userClicksOnDeleteButton() {
        employeeDetailsPage.clickDeleteButton();
    }

    @And("^User clicks \"([^\"]*)\" from the alert pop up$")
    public void userClicksFromTheAlertPopUp(String userInput) throws Throwable {
        employeeDetailsPage.clickOnAlertPopUp(userInput);
    }

    @Then("^Employee should be deleted from the employee list$")
    public void employeeShouldBeDeletedFromTheEmployeeList() {

        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), false);
    }

    @And("^User clicks on Edit button$")
    public void userClicksOnEditButton() {
        employeeDetailsPage.clickOnEditButton();
    }

    @Then("^Employee should not be deleted from the system$")
    public void employeShouldNotBeDeletedFromTheSystem() {
        Assert.assertEquals(employeeDetailsPage.isAddedEmployeeDisplayed(data.getFirstName() + " " + data.getLastName()), true);
    }
}
