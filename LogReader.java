import java.io.*;

public class LogReader {

    public static void readLogs(LogLevel level) {
        try (BufferedReader reader = new BufferedReader(new FileReader("app.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(level.toString())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
