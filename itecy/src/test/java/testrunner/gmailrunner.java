package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:\\AnishaWorkspace\\itecy\\src\\test\\resources\\feature\\feature1.feature"},
					monochrome=true, glue= {"glue"}, 
							plugin= {"pretty" , "html:target\\result1" , "rerun:target\\failed.txt"}
			)

public class gmailrunner {

	
	
	//tags={"@tag1"}
	
}
