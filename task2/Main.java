import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader n = new FileReader(args[0]);
        Scanner scanner = new Scanner(n);
        String[] first = scanner.nextLine().split(" ");


        float x = Float.parseFloat(first[0]);

        float y = Float.parseFloat(first[1]);

        float radius = scanner.nextFloat();

        n = new FileReader(args[1]);
        scanner = new Scanner(n);
        while (scanner.hasNext()) {
            first = scanner.nextLine().split(" ");
            float x1 = Float.parseFloat(first[0]);

            float y1 = Float.parseFloat(first[1]);

            float l = (float) Math.sqrt(Math.pow(Math.abs(x1 - x), 2) + Math.pow(Math.abs(y1 - y), 2));
            if (l > radius) {
                System.out.println("2");
            } else if (l < radius) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }


    }
}