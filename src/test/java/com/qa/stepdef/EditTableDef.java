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
        new EditTablePage().clickOnEditTable();
    }

    @And("^Enter the password$")
    public void enterThePassword() throws InterruptedException{
        new EditTablePage().enterPWDeditable();
    }

    @And("^click on the ok$")
    public void clickOnTheOk() throws InterruptedException{
        new EditTablePage().clickOk();
    }

    @And("^Click on CDT$")
    public void clickOnCDT() throws InterruptedException{
        new EditTablePage().clickOnDropDwn();
    }

    @And("^Click on TCT$")
    public void clickOnTCT() throws InterruptedException{
        new EditTablePage().selectTCTTable();
    }
    @And("^Scroll for TMSURL Using Using direction \"([^\"]*)\"$")
    public void scrollForTMSURLUsingUsingDirection(String arg0) throws Exception {
        new EditTablePage().scrollDwnForEditTmsUrl(arg0);
    }

    @And("^Enter TMSUrl \"([^\"]*)\"$")
    public void enterTMSUrl(String arg0) throws InterruptedException{
        new EditTablePage().editTMSUrl(arg0);
    }
    @And("^Scroll for Appcode Using Using direction \"([^\"]*)\"$")
    public void scrollForAppcodeUsingUsingDirection(String arg0) throws Exception {
        new EditTablePage().scrollDwnForEditAppcode(arg0);
    }

    @And("^Enter AppCode \"([^\"]*)\"$")
    public void enterAppCode(String arg0) throws InterruptedException{
        new EditTablePage().editAppCode(arg0);
    }
    @And("Save the changes")
    public void saveTheChanges() {
        new EditTablePage().saveTable();
    }
    @And("^Restart App$")
    public void restartApp() throws InterruptedException{
        new EditTablePage().reStartApp();
    }
}
