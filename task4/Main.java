import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader n = new FileReader(args[0]);
        Scanner scanner = new Scanner(n);

        List<Integer> nums = new ArrayList<>();
        while (scanner.hasNext()){
            nums.add(scanner.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum = sum + nums.get(i);

        }
        sum = sum / nums.size();


        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            count = count + Math.abs(nums.get(i) - sum);
        }
        System.out.println(count);
    }
}