package com.kraftTech.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Navigate to login page");
    }
    @When("The user logs in with Melih's credentials")
    public void the_user_logs_in_with_melih_s_credentials() {
        System.out.println("Login with Melih credentials");
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Verify that the user logs in successfully");
    }

    @When("The user logs in with Semih's credentials")
    public void theUserLogsInWithSemihSCredentials() {
        System.out.println("Login with Semih credentials");
    }

    @When("The user logs in with Mehmet's credentials")
    public void theUserLogsInWithMehmetSCredentials() {
        System.out.println("Login with Mehmet credentials");
    }
}
