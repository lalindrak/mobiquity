package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Login {
    LoginPage loginPage = new LoginPage();


    private String username;
    @Given("^User logs into the system with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_the_system_with_and(String username, String password) throws Throwable {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    public void setUsername (String name){
        username=name;
    }
    public String getUsername (){
        return username;
    }

    @When("^User clicks on \"([^\"]*)\" to login to the system$")
    public void userClicksOnButtonToLogIn(String value) {
        loginPage.clickSubmitButton(value);
    }


    @Then("^An error message is displayed to the user$")
    public void anErrorMessageIsDisplayedToTheUser() {
        Assert.assertEquals(loginPage.verifyErrorMessage("Invalid username or password!"),true);
        Assert.assertEquals(loginPage.verifyPageURL(),true);
    }

    @Then("^User should be successfully logged out from the system$")
    public void userShouldBeSuccessfullyLoggedOutFromTheSystem() {
        Assert.assertTrue(loginPage.verifyPageURL());
        Assert.assertEquals(loginPage.verifyInputFieldsAreBlank(),true);
    }
}

