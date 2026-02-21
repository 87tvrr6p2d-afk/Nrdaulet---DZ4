import java.io.*;
import java.time.LocalDateTime;

public class Logger {

    private static volatile Logger instance;
    private LogLevel currentLevel;
    private String logFilePath = "app.log";
    private final Object lock = new Object();

    private Logger() {
        currentLevel = LogLevel.INFO;
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        this.currentLevel = level;
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            synchronized (lock) {
                try (FileWriter writer = new FileWriter(logFilePath, true)) {
                    writer.write(LocalDateTime.now() + " [" + level + "] " + message + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
