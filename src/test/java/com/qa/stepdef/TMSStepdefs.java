package com.qa.stepdef;

import com.qa.pages.TMSLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TMSStepdefs {
    @When("^I enter tms username as \"([^\"]*)\"$")
    public void iEnterTmsUsernameAs(String username) throws Exception {
        new TMSLoginPage().enterUsername(username);
    }
    @And("^I enter tms password as \"([^\"]*)\"$")
    public void iEnterTmsPasswordAs(String password) throws Exception {
        new TMSLoginPage().enterPassword(password);
    }
    @When("^I click the submit button$")
    public void iClickTheSubmitButton() throws Exception {
        new TMSLoginPage().clickSubmit();
    }
}
