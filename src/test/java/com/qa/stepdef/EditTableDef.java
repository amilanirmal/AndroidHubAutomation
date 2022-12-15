package com.qa.stepdef;

import com.qa.pages.EditTablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EditTableDef {
    @When("^Open navigation bar$")
    public void openNavigationBar() throws InterruptedException {
        new EditTablePage().openNavigation();
    }

    @And("^Click on Edit table$")
    public void clickOnEditTable() throws InterruptedException{
    }

    @And("^Enter the password$")
    public void enterThePassword() throws InterruptedException{
    }

    @And("^click on the ok$")
    public void clickOnTheOk() throws InterruptedException{
    }

    @And("^Click on CDT$")
    public void clickOnCDT() throws InterruptedException{
    }

    @And("^Click on TCT$")
    public void clickOnTCT() throws InterruptedException{
    }

    @And("^Scroll for TMSURL$")
    public void scrollForTMSURL() throws InterruptedException{
    }

    @And("^Click on TMLSUrl field$")
    public void clickOnTMLSUrlField() throws InterruptedException{
    }

    @And("^Enter TMSUrl \"([^\"]*)\"$")
    public void enterTMSUrl(String arg0) throws InterruptedException{
    }

    @And("^Scroll for Appcode$")
    public void scrollForAppcode() throws InterruptedException{
    }

    @And("^Click on AppCode field$")
    public void clickOnAppCodeField() throws InterruptedException{
    }

    @And("^Enter AppCode \"([^\"]*)\"$")
    public void enterAppCode(String arg0) throws InterruptedException{
    }

    @And("^Restart App$")
    public void restartApp() throws InterruptedException{
    }


}
