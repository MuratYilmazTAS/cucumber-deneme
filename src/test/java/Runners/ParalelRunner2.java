package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/Paralel-reports2.html",
                "json:target/json-Paralel/cucumber2.json",
                "junit:target/xml-Paralel/cucumber2.xml"
        },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@smoke",

        dryRun = false

)

public class ParalelRunner2 {

}
