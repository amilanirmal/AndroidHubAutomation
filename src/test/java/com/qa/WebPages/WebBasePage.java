package com.qa.WebPages;

import com.qa.utils.DriverManager;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBasePage {
    TestUtils utils = new TestUtils();
    public WebDriver webDriver;
    public WebBasePage()
    {
        //webDriver initializing
        this.webDriver = new DriverManager().getWebDriver();
        PageFactory.initElements(webDriver,this);
    }
    //waiting for Web driver
    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(webDriver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    // click on web element
    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }
    //SendKeys for web element
    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
        utils.log().info(txt);
    }
    public String pageTitle()
    {
        return webDriver.getTitle();
    }
    public void scrollDown(WebElement e, String txt) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView(true);",e);
        waitForVisibility(e);
        utils.log().info(txt);
    }
}
