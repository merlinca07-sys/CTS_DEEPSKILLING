public class Logger {
    private static Logger singleLogger;

    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getLogger() {
        if (singleLogger == null) {
            singleLogger = new Logger();
        }
        return singleLogger;
    }

    public void write(String message) {
        System.out.println("Log Message: " + message);
    }
}