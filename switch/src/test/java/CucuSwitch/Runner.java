package CucuSwitch;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\CucuSwitch\\Background.feature"},
		//glue={"src\\demos"},
		plugin={"html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json"},
				format = {"html:Folder_Name"}
		//monochrome=true
		)


public class Runner {
	
	

}
