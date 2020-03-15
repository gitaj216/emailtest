package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features={"Features"},glue={"stepdefinition"},
dryRun=false,monochrome=true,strict=true,
plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})





public class TestRunner {
	
	@BeforeClass
	 public static void writeExtentReport1() throws Exception {
		VideoRecorder_utlity.startRecord("GoogleTestRecording");
	
	 }

	 @AfterClass
	 public static void writeExtentReport() throws Exception {
	Reporter.loadXMLConfig(new File("config/extent-config.xml"));
	VideoRecorder_utlity.stopRecord();
	 }
	

}
