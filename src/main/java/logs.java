import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logs {
    private static final Logger log = LogManager.getLogger(logs.class);

    public static void main(String[] args) {
        log.info("application got started");
        log.trace("application trace started here");
        log.warn("This is a warning");
        log.error("This is a error message");
        log.fatal("this is a critical issues");
        log.debug("finding the bug");
    }
}