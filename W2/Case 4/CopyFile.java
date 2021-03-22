
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            try {
                System.out.println("Enter file name: ");
                String val = scan.nextLine();
                CheckFile.checkF(val);
                String line;
                try (BufferedReader in = new BufferedReader(new FileReader("D:\\Semester 4\\APPL\\PR\\" + val))) {
                    while ((line = in.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.print(e.getMessage());
            }
        }
    }
}
