package dongmengyuan;

/**
 * Created by dongmengyuan on 16-11-18.
 */

import java.util.Scanner;
import java.math.BigInteger;

public class BigInteger1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.next();

        String[] numbers = expression.split("[+]");

        BigInteger left = new BigInteger(numbers[0]);

        BigInteger right = new BigInteger(numbers[1]);

        System.out.println(left.add(right));
    }
}
