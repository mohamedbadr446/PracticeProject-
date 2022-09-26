package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="@Test",features="src/test/resources/features",
        glue = {"steap","setup"},
        plugin = { "pretty", "json:target/reports/cucumber.json"})

public class ExecutionTout extends AbstractTestNGCucumberTests {



}
