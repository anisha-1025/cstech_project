package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:\\AnishaWorkspace\\VCare\\src\\test\\resources\\Feature\\Billing_closeout.feature" },
					monochrome=true, 
					glue= {"VcareGLUE"}
				,plugin= {"pretty" , "html:target\\result1" , "rerun:target\\failed.txt"}
				,strict= false//,dryRun = true
					
			)
public class VCARERunner {

}





//@CucumberOptions(features={C:\\njdfnvjdh.feature}, glue={Packagename})