import java.io.FileInputStream;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        // try catch
        try {
            FileInputStream file = null;
            file = new FileInputStream("file.txt");
            file.close();
        } catch (IOException e) {
            // recover from exception
            // creat new file
            // log error
        }
    }
}
