package com.kraftTech.step_defs;

import com.kraftTech.pages.UserProfilePage;
import io.cucumber.java.en.When;

public class UserProfile_StepDefs {
    UserProfilePage userProfilePage=new UserProfilePage();
    @When("The user should be able navigate User Profile Page Tabs with {string}")
    public void the_user_should_be_able_navigate_user_profile_page_tabs_with(String tabName) {
        userProfilePage.navigateEditProfileTabs(tabName);
    }
}
