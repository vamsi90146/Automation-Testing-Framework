
package com.company.project.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import com.company.project.automation.spring.SpringContext;

@CucumberOptions(
    features="src/test/resources/features",
    glue="com.company.project.automation.steps",
    plugin={"pretty","html:reports/result.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void initSpring(){
        SpringContext.init();
    }
}
