package pkg;

import org.tinylog.Logger;

public class main {
    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("This is a WARN string");
        Logger.info("This is an INFO message");
        Logger.debug("This is an DEBUG message");
        Logger.trace("This is an TRACE message");
        Logger.info("User's name is " + System.getProperty("user.name"));
        Logger.info("User'name is {}",System.getProperty("user.name"));
        Logger.error(new RuntimeException("OOPS"),"Something is erong");
    }
}
