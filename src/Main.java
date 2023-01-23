import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(equation(a, b));*/

        File file = new File("C:\\Users\\user\\Desktop\\text.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Have a good day!");
        writer.write("Mighty Java programmer");
        writer.close();

        FileWriter writer1 = new FileWriter(file, true);
        writer1.write("\nThank you, my deer!");
        writer1.close();

        File file1 = new File("C:\\Users\\user\\Desktop\\text.txt");
        try (FileWriter writer3 = new FileWriter(file1)) {
            writer3.write("Hello!");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

    }
}