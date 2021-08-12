package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//log levels T- trace, D-debug, I-info, W-warn,E-error, F-fatal
public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
//		System.out.println();//never use this instead use logging
		logger.fatal("fatal message");//Stackoverflow error
		logger.error("error message");
		logger.warn("warning message");
		logger.info("info message");
		logger.debug("this is a debug message");
		logger.trace("trace");

		
	}
}
