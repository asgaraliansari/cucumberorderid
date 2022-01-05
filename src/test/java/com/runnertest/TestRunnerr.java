package com.runnertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.typedefinitioon"},monochrome=true)
public class TestRunnerr {

}
