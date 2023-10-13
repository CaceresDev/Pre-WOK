package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:\\Reactz\\Proyecto1-PreWORK\\src\\test\\java\\features",
        glue = ("selenium"),
        plugin = ("json:test/report/cucumber_resport.jason")

)


public class Testrunner {
}
