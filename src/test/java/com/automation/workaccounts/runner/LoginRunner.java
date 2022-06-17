package com.automation.workaccounts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Resources/Feature/Login.feature", glue="com.automation.workaccounts.featuresteps",monochrome = true, stepNotifications=true)


public class LoginRunner {

}