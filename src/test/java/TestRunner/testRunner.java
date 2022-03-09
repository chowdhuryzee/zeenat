package TestRunner;


	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

import Util.testBase;
import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(features = {"src/test/resources/Feature"},
	plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},

	glue = {"Stepdef"},
	tags = {"@Test"},
	monochrome = true)


	public class testRunner extends AbstractTestNGCucumberTests {

		@BeforeTest
		public void LaunchAppURL() {
			testBase Open = new testBase();
			Open.initialize();
			
		}

		@AfterTest
		public void CloseAppURL() throws Exception {
			testBase Closed = new testBase();
			Thread.sleep(10000);
			Closed.driver.quit();
		
		
		}
		
	}


