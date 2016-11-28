package dongmengyuan;

/**
 * Created by dongmengyuan on 16-11-18.
 */

import java.util.Scanner;
import java.math.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int a = 0, flag = 0;
        while (true) {
            flag = 0;
            if (i % 2 == 0) {
                continue;
            } else {
                for (int t = 2; t < Math.sqrt(i); t++) {
                    if (i % t == 0) {
                        flag = 1;
                        break;
                    }
                    if (flag == 0) {
                        System.out.println(i);
                        a++;
                    }
                }
                if (a == j) {
                    break;
                }
            }
        }
    }
}

