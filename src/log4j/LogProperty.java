package log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogProperty {
	static Logger log = Logger.getLogger(LogProperty.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("logProperty");
		log.info("welcome");
		log.warn("simple Mistake warinig");
		log.error("Exception Throw");
		log.fatal("Critical Error");
		log.debug("this line is debug");
	}
}
