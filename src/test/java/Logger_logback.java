import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger_logback {

    public static void main(String args[]) {

        System.setProperty("logback.configurationFile", "logback.xml");
        Logger logger = LoggerFactory.getLogger(Logger_logback.class);
        logger.info("logging using logback with slf4j");
    }
}