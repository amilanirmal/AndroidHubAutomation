package com.qa.stepdef;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;
import com.qa.utils.VideoManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {


    @Before("@appium")
    public void initialize() throws Exception {
       GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
        new VideoManager().startRecording();
    }
    @Before("@web")
    public void initialize1() throws Exception {
        new DriverManager().initializeWebDriver();
    }

    @After("@appium")
    public void quit1(Scenario scenario) throws IOException {

        if(scenario.isFailed()){
            //screenshot for appium driver
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        new VideoManager().stopRecording(scenario.getName());
        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }

    @After("@web")
    public void quit2(Scenario scenario) throws IOException {


            // Screenshot for web driver
            WebDriver webDriverScr = new DriverManager().getWebDriver();
            byte[] webScreenShot = ((TakesScreenshot)webDriverScr).getScreenshotAs(OutputType.BYTES);
            scenario.attach(webScreenShot, "image/png", scenario.getName());
        DriverManager driverManager = new DriverManager();
        if(driverManager.getWebDriver() != null){
            driverManager.getWebDriver().quit();
        }
        }


}
