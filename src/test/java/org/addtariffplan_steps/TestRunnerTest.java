package org.addtariffplan_steps;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/", glue= "org.addtariffplan_steps", plugin= "html:target")

public class TestRunnerTest {

}
