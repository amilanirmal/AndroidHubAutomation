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


}
