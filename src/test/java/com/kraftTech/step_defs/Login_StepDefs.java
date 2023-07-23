package com.kraftTech.step_defs;

import com.kraftTech.pages.LoginPage;
import com.kraftTech.utilities.ConfigurationReader;
import com.kraftTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user logs in with Melih's credentials")
    public void the_user_logs_in_with_melih_s_credentials() {
       loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String currentUrl = Driver.get().getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedUrl,currentUrl);
    }

    @When("The user logs in with Semih's credentials")
    public void theUserLogsInWithSemihSCredentials() {
        System.out.println("Login with Semih credentials");
    }

    @When("The user logs in with Mehmet's credentials")
    public void theUserLogsInWithMehmetSCredentials() {
        System.out.println("Login with Mehmet credentials");
    }

    @When("The user logs in with Rosa's credentials")
    public void theUserLogsInWithRosaSCredentials() {
        loginPage.login("rosa@test.com","Test123456");
    }
}
