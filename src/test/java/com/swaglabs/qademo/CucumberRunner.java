package com.swaglabs.qademo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.swaglabs.qademo.bdd",
        plugin = {
                "pretty",
                "json:target/report/cucumber-report.json",
                "html:target/report/"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
