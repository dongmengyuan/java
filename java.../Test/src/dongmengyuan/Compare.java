package dongmengyuan;

/**
 * Created by dongmengyuan on 16-11-18.
 */

import java.util.Scanner;
public class Compare {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str[] = new String[5];
        for (int i = 0;i < 5; i++) {
            str[i] = input.next();
        }
        Integer num[] = new Integer[5];
        for (int i = 0; i < 5; i++){
            num[i] = input.nextInt();
        }
        System.out.println("Max string is " + max(str) + "\n" + "Max integer is " + max(num));
    }

    public static Object max(Comparable[] a){

        Comparable maxVal = a[0];
        for (int i = 0; i < a.length; i++){
            if (maxVal.compareTo(a[i]) < 0){
                maxVal = a[i];
            }
        }

        return maxVal;
    }
}
