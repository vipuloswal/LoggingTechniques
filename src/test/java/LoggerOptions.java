import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;*/

import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LoggerOptions {

    public static void main(String args[]) {

        //Logging using default java provided logger JUL
        java.util.logging.Logger defaultLogger= java.util.logging.Logger.getLogger(LoggerOptions.class.getName());
        defaultLogger.info("Logging using default java logging");

        /*//Logging using log4j 2.x logger
        Logger log4jLogger = (Logger) LogManager.getLogger(LoggerOptions.class);
        log4jLogger.error("Logging using log4j2.17.1 java logging");*/

        //Logging using slf4j logger
        Logger slf4jLogger = LoggerFactory.getLogger(LoggerOptions.class);
        slf4jLogger.info("Logging using slf4j logging with slf4j simple implementation");

        //Logging using Logback
        Logger logbackLogger = LoggerFactory.getLogger(LoggerOptions.class);
        logbackLogger.info("Logging using slf4j logging with logback");
    }
}