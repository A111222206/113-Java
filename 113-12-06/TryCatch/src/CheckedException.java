import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println("處理受檢例外：" + e.getMessage());
        }
    }
}
