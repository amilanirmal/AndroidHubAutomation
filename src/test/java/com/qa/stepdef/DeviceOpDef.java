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
    public void iVerifyDeviceOnBoarding() throws InterruptedException {
        new TMSOperationPage().verifyDevice();
    }
    @And("^I click on assign operation$")
    public void iClickOnAssignOperation() {

        new TMSOperationPage().selectAssignOperation("assign operation");

    }
    @And("^I select the device operation \"([^\"]*)\"$")
    public void iSelectTheDeviceOperation(String arg0) throws InterruptedException{
        new TMSOperationPage().selectOperation(arg0);
    }

    @And("^Send operation to right side$")
    public void sendOperationToRightSide() {
        new TMSOperationPage().sendToRightSide("sent operation to right side");
    }

    @And("^Click on assign$")
    public void clickOnAssign() throws InterruptedException {
        new TMSOperationPage().assignedOperation("assign operation");
    }

    @And("close popup window")
    public void closePopupWindow() throws InterruptedException {
        new TMSOperationPage().closeWindow("Close current pop up");
    }
    @And("^scroll down for gride table one$")
    public void scrollDownForGrideTable() throws InterruptedException{
        new TMSOperationPage().scrollForGridTable1();
    }

    @Then("Operation should be completed")
    public void operationShouldBeCompleted() throws InterruptedException{
        new TMSOperationPage().operationStatusChecker();
    }

}
