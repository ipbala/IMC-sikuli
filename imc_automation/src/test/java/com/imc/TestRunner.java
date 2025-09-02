package com.imc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.sikuli.script.ImagePath;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@CucumberOptions(
    features = "src/test/features",
    glue = {"stepDefinations", "myHooks"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
   // tags = "@SmokeTest or @Regression",
    dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
   
    
   
    @BeforeTest
    void beforeTest() {
        // image path for sikuli , nned to see if this can be moved to the testng.xml
       ImagePath.setBundlePath("C:\\Users\\bayyappa\\workspace\\Workspace-ocr\\IMC-sikuli\\imc_automation\\src\\main\\resources\\images");

    }
    @Test
    public void runCucumber() {
    }
    
    @AfterTest
    void AfterTest() {

    }
}