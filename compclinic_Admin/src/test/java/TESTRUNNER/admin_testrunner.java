package TESTRUNNER;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:\\AnishaWorkspace\\compclinic_Admin\\src\\test\\resources\\FEATURE\\UserDetails.feature"},
					monochrome=true, 
					glue= {"ADMIN_GLUE"}
				,plugin= {"pretty" , "html:target\\result1" , "rerun:target\\failed.txt"}
				//,dryRun = true
					
			)
public class admin_testrunner {

}
