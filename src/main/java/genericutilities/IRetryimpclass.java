package genericutilities;

import org.testng.ITestResult;

public class IRetryimpclass {
	int counter = 0;
	int retrylimit = 3;
	
	
	/** Retries a failed test case until the retry limit is reached.
	 * 
	 * @param result
	 * @return true if the test should be retried, false otherwise
	 */
	public boolean retry(ITestResult result) {
		if (counter < retrylimit) {
			counter++;
			return true;
		}
		return false;
	}

}
