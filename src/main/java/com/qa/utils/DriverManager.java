package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    //Web driver
    public static WebDriver getWebDriver() {
        return webDriver.get();
    }

    public static void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver.set(new ChromeDriver());
    }

    // Appium Driver
    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {

        AppiumDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();

        if (driver == null) {
            try {
                utils.log().info("initializing Appium driver");
                switch (params.getPlatformName()) {
                    case "Android":
                        driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        break;
                    case "iOS":
                        driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        break;
                }
                if (driver == null) {
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }

    public void initializeWebDriver() throws Exception {
        WebDriver webDriver = null;
        try {
            if (webDriver == null) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
                setWebDriver();
                webDriver = getWebDriver();
                webDriver.get("http://124.43.16.185:50501/TMS_V2.05/?param=RVBJQ3xCTUw=");
                webDriver.manage().window().maximize();

            }
        } catch (WebDriverException wex) {
            wex.printStackTrace();
            utils.log().fatal("WebDriver initialization failure. ABORT !!!!" + wex.toString());
            throw wex;
        }


    }
}
