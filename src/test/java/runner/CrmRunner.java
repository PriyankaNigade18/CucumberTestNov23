package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Crm.feature",
					glue={"stepdef","hooksDemo"},
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					publish=true)
public class CrmRunner {

}
