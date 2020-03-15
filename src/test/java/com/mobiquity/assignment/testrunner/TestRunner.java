package com.mobiquity.assignment.testrunner;

import com.mobiquity.assignment.testbase.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(features = "src/test/java/com/mobiquity/assignment/features/login-logout.feature", glue = {"com/mobiquity/assignment/definitions"},plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
        monochrome = true, dryRun = false)

public class TestRunner extends TestBase {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void testDownClass() {
        testNGCucumberRunner.finish();
    }

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = {
//                "pretty",
//                "html:target/cucumber",
//                "json:target_json/cucumber.json",
//                "junit:taget_junit/cucumber.xml"
//        },
//        features =
//                {
//                        "src/test/java/com/mobiquity/assignment/features/login-logout.feature"
//
//                },
//        glue =
//                {
//                        "com.mobiquity.assignment.definitions"
//                },
//        monochrome = true,
//        tags =
//
//                {"@testing"
//
//                },
//        dryRun = false
//
//
//)
//
//public class TestRunner extends TestBase {

}

