package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditTablePage extends BasePage{
    TestUtils utils = new TestUtils();
    @FindBy(how = How.XPATH, using = "//*[@contentDescription='open']")
    private MobileElement navigationBar;
    public EditTablePage()
    {}
    public EditTablePage openNavigation()
    {
        click(navigationBar, "press login button");
        return this;
    }
}
