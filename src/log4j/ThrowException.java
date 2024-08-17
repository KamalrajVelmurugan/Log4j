package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ThrowException {
	static Logger log = Logger.getLogger(ThrowException.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		try {
			int a =10;
			int b =0;
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			log.error(ae);
		}
	}
}
