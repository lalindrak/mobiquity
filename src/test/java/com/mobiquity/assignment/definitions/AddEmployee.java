package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.data.Data;
import com.mobiquity.assignment.pages.AddEmployeePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

public class AddEmployee {
    AddEmployeePage addEmployeePage = new AddEmployeePage();
    private Data data;

    public AddEmployee(Data data) {
        this.data = data;
    }

    @When("^User fills the employee information$")
    public void userFillsTheEmployeeInformation(DataTable employee) {
        Assert.assertEquals(addEmployeePage.verifyPageURL(), true);
        addEmployeePage.fillEmployeeInformation(employee);
        data.setFirstName(addEmployeePage.getFirstName());
        data.setLastName(addEmployeePage.getLastName());
        data.setStartDate(addEmployeePage.getStartDate());
        data.setEmail(addEmployeePage.getEmail());
    }

    @And("^User clicks on the Add button$")
    public void userClicksOnTheAddButton() {
        addEmployeePage.clickSubmit();
    }

    @Then("^User should get assertion errors$")
    public void userShouldGetAssertionErrors() {
        Assert.assertEquals(addEmployeePage.assertFirstName(),false);
        Assert.assertEquals(addEmployeePage.assertLastName(),false);
        Assert.assertEquals(addEmployeePage.assertStartDate(),true);
        Assert.assertEquals(addEmployeePage.assertEmail(),false);
    }

    @And("^User click on Cancel button$")
    public void userClickOnCancelButton() {
        addEmployeePage.clickCancel();
    }

    @When("^User edits the employee information as below$")
    public void userEditsTheEmployeeInformationAsBelow(DataTable employee) {
        addEmployeePage.fillEmployeeInformation(employee);
        data.setFirstName(addEmployeePage.getFirstName());
        data.setLastName(addEmployeePage.getLastName());
        data.setStartDate(addEmployeePage.getStartDate());
        data.setEmail(addEmployeePage.getEmail());
    }

    @And("^User clicks on Update button$")
    public void userClicksOnUpdateButton() {
        addEmployeePage.clickUpdate();
    }
}