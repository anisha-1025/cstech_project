package TESTRUNNER;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:\\AnishaWorkspace\\compclinic\\src\\test\\resources\\feature\\ChangePwd_Account_Logout.feature"},
					monochrome=true, 
					glue= {"CompclinicGLUE"}
				,plugin= {"pretty" , "html:target\\result1" , "rerun:target\\failed.txt"}
				//,dryRun = true
					
			)

public class compclinicrunner {

}
