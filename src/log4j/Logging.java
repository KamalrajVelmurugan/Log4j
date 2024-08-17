package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logging {
	
	static Logger log = Logger.getLogger(Logging.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("welcome");
		log.warn("simple Mistake warinig");
		log.error("Exception Throw");
		log.fatal("Critical Error");
		log.debug("this line is debug");
	}
}
