public class Main {
    public static void main(String[] args) {

        Logger firstLogger = Logger.getLogger();
        firstLogger.write("Starting the system");

        Logger secondLogger = Logger.getLogger();
        secondLogger.write("Still using the same logger");

        if (firstLogger == secondLogger) {
            System.out.println("Confirmed: Only one logger exists");
        } else {
            System.out.println("Different loggers exist — something went wrong");
        }
    }
}