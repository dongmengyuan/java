package dongmengyuan;

/**
 * Created by dongmengyuan on 16-11-18.
 */

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;
import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[]s = new Integer[5];
        for(int i = 0; i < s.length; i++) {
            s[i] = input.nextInt();
        }
        Arrays.sort(s);
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
