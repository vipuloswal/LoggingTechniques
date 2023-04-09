import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;
import java.io.IOException;

public class Logger_log4j2 {
    public static void main(String args[]) throws IOException {

        /*LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        File file = new File("log4j2.xml");

        // this will force a reconfiguration
        context.setConfigLocation(file.toURI()); */

        System.setProperty("log4j.configurationFile", "log4j2.xml");
        //System.setProperty("log4j.configurationFile", "log4j2.properties");
        Logger logger = LogManager.getLogger(Logger_log4j2.class);
        logger.info("Logging using log4j 2.x configuration file");
    }
}