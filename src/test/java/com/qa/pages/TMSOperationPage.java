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

    @FindBy(how = How.XPATH, using = "//*[@id=\"newListsp\"]//option[text()='ECHO Operation']")
    private WebElement echoOpe;
}
