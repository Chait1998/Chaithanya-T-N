package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\TNChait\\eclipse-workspace\\BDDFramework\\src\\test\\resources\\Appfeaturs\\LoginPage.feature"},
		glue = {"Stepdefination"},
		monochrome=true,
		plugin = {"pretty"}
		
		)
	public class MyTestRunner {

	}
 
