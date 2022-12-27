package com.qa.pages;

import com.qa.WebPages.WebBasePage;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMSOperationPage extends WebBasePage {
    TestUtils utils = new TestUtils();
    @FindBy(how = How.XPATH, using = "//div[@class='section-title']/img[@src='resources/assets/image/icons/drop_down.svg']")
    private WebElement menuDropDwn;

    @FindBy(how = How.XPATH, using = "//ul[@class='section-list']/li[text()='Device Section']")
    private WebElement deviceSection;

    @FindBy(how = How.XPATH, using = "//ul[@class='sub-link-list']//li//a[text()='Device Operation Management']")
    private WebElement deviceOpManagement;

    @FindBy(how = How.XPATH, using = "//table[@id='gridtable']//td[text() = 'V1E0181065']/following-sibling::td[6]")
    private WebElement assignOperation;

    @FindBy(how = How.XPATH, using = "//table[@id='gridtable']//td[text() = 'V1E0181065']")
    private WebElement deviceX990;

    @FindBy(how = How.XPATH, using = "//*[@id=\"newListsp\"]//option[text()='ECHO Operation']")
    private WebElement echoOpe;

    @FindBy(how = How.XPATH, using = "//*[@id=\"newListsp\"]//option[text()='Profile Download']")
    private WebElement profileDwnload;

    @FindBy(how = How.XPATH, using = "//a[@id='rightsp']")
    private WebElement arrowSelectSingleOp;

    @FindBy(how = How.XPATH, using = "//a[@id='rightallsp']")
    private WebElement arrowSelectAllOp;

    @FindBy(how = How.XPATH, using = "//a[@id='leftsp']")
    private WebElement arrowRemoveSigleOp;

    @FindBy(how = How.XPATH, using = "//a[@id='leftallsp']")
    private WebElement arrowRemoveAllOp;

    @FindBy(how = How.XPATH, using = "//input[@id='assignbutasp']")
    private WebElement assignBtn;


    public TMSOperationPage()
    {
    }
    public TMSOperationPage extractSideBar(String msg)
    {
        click(menuDropDwn,msg);
        return this;
    }
    public TMSOperationPage selectDeviceSection(String msg)
    {
        click(deviceSection,msg);
        return this;
    }
    public TMSOperationPage selectDeviceOperation(String msg)
    {
        click(deviceOpManagement,msg);
        return this;
    }
    public TMSOperationPage verifyDevice()
    {
        scrollDown(deviceX990,"scrolling for device");
        waitForVisibility(deviceX990);
        return this;
    }
    public TMSOperationPage selectAssignOperation(String msg)
    {
        waitForVisibility(assignOperation);
        click(assignOperation,msg);
        return this;
    }

    public TMSOperationPage selectOperation(String msg)
    {
        deviceOperationCommonMethod(msg);
        return this;
    }

    public TMSOperationPage sendToRightSide(String msg)
    {
        waitForVisibility(arrowSelectSingleOp);
        click(arrowSelectSingleOp,msg);
        return this;
    }
    public TMSOperationPage assignedOperation(String msg) throws InterruptedException {
        click(assignBtn,msg);
        Thread.sleep(5000);
        return this;
    }


}
