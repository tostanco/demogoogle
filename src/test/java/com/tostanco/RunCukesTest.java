package com.tostanco;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// import cucumber.api.CucumberOptions;
// import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/com/tostanco", 
glue = { "com.tostanco.stepDefs" }, 
plugin = { "pretty", "html:target/htmlReport",  
"json:target/report.json"},
// plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
// "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm" }, 
// plugin = { "pretty", "html:target/allure-results" }, 
monochrome = true,
dryRun = false,
tags = ("@SmokeTest"))
public class RunCukesTest {
}
