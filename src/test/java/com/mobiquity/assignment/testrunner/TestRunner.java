package com.mobiquity.assignment.testrunner;

import com.mobiquity.assignment.testbase.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target_json/cucumber.json",
                "junit:taget_junit/cucumber.xml"
        },
        features =
                {
                        "src/test/java/com/mobiquity/assignment/features"

                },
        glue =
                {
                        "com.mobiquity.assignment.definitions"
                },
        monochrome=true,
        tags =

                {     //"@bvt"

                }


)

public class TestRunner extends TestBase{

}
