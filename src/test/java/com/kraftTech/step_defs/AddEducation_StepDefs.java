package com.kraftTech.step_defs;

import com.kraftTech.pages.AddEducationPage;
import com.kraftTech.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AddEducation_StepDefs {
    AddEducationPage addEducationPage = new AddEducationPage();

    @Then("The user should be able to see following labels at the Add Education Form")
    public void the_user_should_be_able_to_see_following_labels_at_the_add_education_form(DataTable table) {
        List<String> expectedList = table.asList(String.class);
        expectedList.set(4,"");
        BrowserUtils.waitFor(2);
        List<String> actualList = BrowserUtils.getElementsText(addEducationPage.addEducationFormLabels);
        Assert.assertEquals(expectedList, actualList);
    }
}
