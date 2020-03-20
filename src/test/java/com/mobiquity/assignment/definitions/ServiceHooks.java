package com.mobiquity.assignment.definitions;

import com.mobiquity.assignment.enums.Browsers;
import com.mobiquity.assignment.helper.LoggerUtil;
import com.mobiquity.assignment.testbase.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


public class ServiceHooks {
    TestBase testBase;
    Logger log = LoggerUtil.getLogger(ServiceHooks.class);

    @Before
    public void initializeTest() {
        testBase = new TestBase();
        testBase.selectBrowser(Browsers.CHROME.name());
    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            log.error(scenario.getName() + " is failed");

            try {
                final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); // ... and embed it in
            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        } else {
            try {
                log.info(scenario.getName() + " is passed");
                scenario.embed(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        TestBase.driver.quit();
    }
}
