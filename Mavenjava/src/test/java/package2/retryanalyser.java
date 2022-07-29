

package package2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Ignore;

public class retryanalyser implements IRetryAnalyzer {
	int count=0;
	 int retryLimit = 4;
	@Override
	public boolean retry(ITestResult result) {
	
		// TODO Auto-generated method stub
		if(count < retryLimit)
		 {
		 count++;
		 return true;
		 }
		 return false;
		 
	}

}
