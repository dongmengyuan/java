package dongmengyuan;

/**
 * Created by dongmengyuan on 16-11-18.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner input =  new Scanner(System.in);
        for(int i = 0; i < str.length; i++) {
            str[i] = input.nextLine();
        }
        Arrays.sort(str);
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
