
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LoggerOptions {

    public static void main(String args[]) {

        /*//Logging using default java provided logger
        java.util.logging.Logger logger= java.util.logging.Logger.getLogger(LoggerOptions.class.getName());
        logger.info("Logging using default java logging");*/

        /*//Logging using log4j 2. logger
        Logger logger = LogManager.getLogger(LoggerOptions.class);
        logger.error("Logging using log4j2.17.1 java logging");*/

        /*//Logging using slf4j logger
        Logger logger = LoggerFactory.getLogger(LoggerOptions.class);
        logger.info("Logging using slf4j logging with slf4j simple implementation");*/

        /*//Logging using Logback
        Logger logger = LoggerFactory.getLogger(LoggerOptions.class);
        logger.info("Logging using slf4j logging with logback");*/
    }
}