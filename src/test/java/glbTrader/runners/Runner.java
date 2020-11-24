package glbTrader.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",//Rapor olusturmak icin
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",//Feature clasinin adresi
        glue = "glbTrader/stepdefinitions",//testletin icerisinde oldugu paketin ismi
        tags = "@glbTraderTC08",
        dryRun = false  //
)
public class Runner {

}
