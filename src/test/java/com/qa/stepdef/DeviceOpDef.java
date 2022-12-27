package com.qa.stepdef;

import com.qa.pages.TMSOperationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeviceOpDef {
    @And("^I extract the side menu$")
    public void iExtractTheSideMenu() {
        new TMSOperationPage().extractSideBar("extract the left side bar");
    }

    @And("^I select the Device section$")
    public void iSelectTheDeviceSection() {
        new TMSOperationPage().selectDeviceSection("select device section");

    }
    @And("^I select the device operation Management page$")
    public void iSelectTheDeviceOperationManagementPage() {
        new TMSOperationPage().selectDeviceOperation("select device operation");

    }
    @And("^I verify device on Boarding$")
    public void iVerifyDeviceOnBoarding() {
        new TMSOperationPage().verifyDevice();
    }
    @And("^I click on assign operation$")
    public void iClickOnAssignOperation() {

        new TMSOperationPage().selectAssignOperation("assign operation");

    }
}
