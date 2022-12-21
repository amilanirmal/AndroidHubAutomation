package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditTablePage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='open']")
    private MobileElement navigationBar;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Edit Table']")
    private MobileElement editTableBtn;

    @AndroidFindBy(id = "passwordEditText")
    private MobileElement editTablepwd;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement editTablePwdOK;

    @AndroidFindBy(id = "button2")
    private MobileElement editTablePwdCancel;

    @AndroidFindBy(id = "custom_spinner")
    private MobileElement tableDropDown;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='TCT']")
    private MobileElement tCTTable;

    @AndroidFindBy(xpath ="//android.widget.EditText[@index='77']")
    private MobileElement tmsUrl;

    @AndroidFindBy(xpath ="//android.widget.EditText[@index='95']")
    private MobileElement appCode;

    @AndroidFindBy(id = "btn_Save")
    private MobileElement saveBtn;

    public EditTablePage()
    {}
    public EditTablePage openNavigation()
    {
        click(navigationBar, "press login button");
        return this;
    }
    public EditTablePage clickOnEditTable()
    {
        click(editTableBtn, "press edit table");
        return this;
    }
    public EditTablePage enterPWDeditable()
    {
        sendKeys(editTablepwd, "123");
        return this;
    }

    public EditTablePage clickOk()
    {
        click(editTablePwdOK, "click OK");
        return this;
    }
    public EditTablePage clickOnDropDwn()
    {
        click(tableDropDown, "click on table drop down");
        return this;
    }

    public EditTablePage selectTCTTable()
    {
        click(tCTTable, "Select TCT table");
        return this;
    }
    public EditTablePage scrollDwnForEditTmsUrl(String val) throws Exception {
        scrollToElement(tmsUrl, val);
        return this;
    }
    public EditTablePage scrollDwnForEditAppcode(String val) throws Exception {
        scrollToElement(appCode, val);
        return this;
    }

    public EditTablePage editTMSUrl(String url)
    {
        clear(tmsUrl);
        sendKeys(tmsUrl, url);
        return this;
    }

    public EditTablePage editAppCode(String txtCode)
    {
        sendKeys(appCode, txtCode);
        return this;
    }
    public EditTablePage reStartApp()
    {
        closeApp();
        launchApp();
        return this;
    }
}
