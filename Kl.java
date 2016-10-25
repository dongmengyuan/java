/*************************************************************************
        > File Name: Kl.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月18日 星期日 09时05分22秒
 ************************************************************************/

import java.util.Scanner;
public class Kl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("英里      千米      千米      英里");
        for ( int i = 1; i <= 10; i++ ) {
            double k = 1.609 * i;
            int km = 20 + 5 * (i - 1);
            double yl = km / k;           
            System.out.println((i)       (k)        (km)       (yl));
        }
    }
}

