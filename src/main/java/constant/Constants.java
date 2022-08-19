package constant;

public class Constants {
	
	public static long WAIT_TIMEOUT;
	public static long SHORT_WAIT_TIMEOUT;
	public static long MEDIUM_WAIT_TIMEOUT;
	public static long STALE_ELEMENT_WAIT_TIMEOUT;

	public static void setTimeouts(long waitTimeoutArg,long shortWaitTimeoutArg,long mediumWaitTimeoutArg,long staleElementWaitTimeoutArg) {
		WAIT_TIMEOUT=waitTimeoutArg;
		SHORT_WAIT_TIMEOUT=shortWaitTimeoutArg;
		MEDIUM_WAIT_TIMEOUT=mediumWaitTimeoutArg;
		STALE_ELEMENT_WAIT_TIMEOUT=staleElementWaitTimeoutArg;
	}
}
