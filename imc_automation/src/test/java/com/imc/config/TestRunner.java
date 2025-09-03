package com.imc.config;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.sikuli.script.ImagePath;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@CucumberOptions(
    features = "src/test/features",
    glue = {"com.imc.stepDefinitions", "myHooks"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
   // tags = "@SmokeTest or @Regression",
    dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
   
    
   
    @BeforeTest
    void beforeTest() {
        // Use ConfigReader from utils package to get sikuli.path
        String sikuliPath = com.imc.utils.ConfigReader.getProperty("sikuli.path");
        if (sikuliPath != null && !sikuliPath.isEmpty()) {
            ImagePath.setBundlePath(sikuliPath);
        } else {
            System.err.println("sikuli.path not set in config.properties");
        }
    }
    @Test
    public void runCucumber() {
    }
    
    @AfterTest
    void AfterTest() {

    }
}