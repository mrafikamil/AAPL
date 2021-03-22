
import java.io.FileNotFoundException;
import java.io.File;

public class CheckFile {

    static void checkF(String s) throws FileNotFoundException {

        File file = new File("D:\\Semester 4\\APPL\\PR\\" + s);
        if (file.exists() && file.isFile()) {
            System.out.println("file exists, printing..");
        } else {
            throw new FileNotFoundException("File Not Found!\n");
        }
    }
}
