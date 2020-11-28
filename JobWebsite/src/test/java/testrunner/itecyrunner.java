package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:\\AnishaWorkspace\\JobWebsite\\src\\test\\resources\\feature\\feature.feature"},
					monochrome=true, 
					glue= {""}, 
							plugin= {"pretty" , "html:target\\result1" , "rerun:target\\failed.txt"}
			)

public class itecyrunner {

	
	
	
	
}
//tags={"@tag1"}