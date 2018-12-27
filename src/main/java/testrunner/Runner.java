package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\TYSS\\Desktop\\punit\\mavenproject\\src\\main\\java\\featurefile\\examplegroup.feature",glue={"stepdefination"},
format= {"pretty","html: test-output","json:json_output/cumber.json","junit:junit_xml/cucumber.xml"},dryRun=false,monochrome=true,tags = {"~@SmokeTest","@RegressionTest"})
public class Runner 				
{		

}
