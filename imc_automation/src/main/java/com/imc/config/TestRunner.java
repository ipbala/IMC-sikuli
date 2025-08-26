package com.imc.config;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.sikuli.script.ImagePath;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
    features = "src/test/features",
    glue = {"stepDefinations", "myHooks"},
   // plugin = {"pretty", "html:target/cucumber-reports"}
    tags = "@chrome",
    plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            "timeline:test-output-thread/",
            "rerun:src/test/resources/failedrerun.txt"},
    monochrome = true,
    publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeTest
    void beforeTest() {
        // image path for sikuli , nned to see if this can be moved to the testng.xml
       ImagePath.setBundlePath("C:\\Users\\Admin\\Workspace\\Workspace-git\\IMC-sikuli\\imc_automation\\src\\main\\resources\\images");

    }

    @AfterTest
    void AfterTest() {

    }
}