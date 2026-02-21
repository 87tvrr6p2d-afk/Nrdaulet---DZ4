public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.setLogLevel(LogLevel.INFO);

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                logger.log("Thread 1 message " + i, LogLevel.INFO);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                logger.log("Thread 2 error " + i, LogLevel.ERROR);
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
