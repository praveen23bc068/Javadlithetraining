import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception2 {
    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("sample.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
        System.out.println("done");
    }
}