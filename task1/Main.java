import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n =Integer.parseInt(args[0]);

        int m = Integer.parseInt(args[1]);
        int[] newArray = new int[n];

        for(int i = 0; i < n ; i++){
            newArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(newArray));
        int current = 0;

        for (int i = 0; i < newArray.length ; i++) {
            System.out.print(newArray[current]);
            current = (current + m - 1) % n;
            if(newArray[current] == 1)
                break;
        }

    }
}