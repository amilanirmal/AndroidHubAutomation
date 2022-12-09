package com.qa.pages;

import com.qa.WebPages.WebBasePage;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMSLoginPage extends WebBasePage {
    TestUtils utils = new TestUtils();

    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/div[3]/div/button")
    private WebElement submitBtn;

    public TMSLoginPage()
    {}

    public TMSLoginPage enterUsername(String usernameTxt) throws InterruptedException
    {
        sendKeys(username,usernameTxt);
        return this;
    }
    public TMSLoginPage enterPassword(String passwordTxt) throws InterruptedException
    {
        sendKeys(password,passwordTxt);
        return this;
    }

    public TMSLoginPage clickSubmit() throws InterruptedException
    {
        click(submitBtn,"enter submit");
        return this;
    }
}
