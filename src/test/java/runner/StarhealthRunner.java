package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sivap\\eclipse-workspace\\Phase2EndprojectCucumber\\src\\test\\java\\feature\\starhealth.feature",
                 glue= {"step"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "timeline:test-output-thread/"
                		 },
                 tags="@training or @simplilearn"
        )

public class StarhealthRunner {

}
