package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * Single scenario: tags="@homepage"
 * Multiple scenario: tags="@homepage or @BestSeller"
 * Ignore specific scenario: "not @Mobiles"
 * Ignore multiple scenario: @ignore
 * To run all: @All
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="stepdef",
					tags="@All"
					
					)
public class AmazonRunner {

}
