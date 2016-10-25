/*************************************************************************
        > File Name: Day.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月18日 星期日 08时48分18秒
 ************************************************************************/

import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter year: ");
        int year = input.nextInt();
        System.out.print("enter month : 1-12 : ");
        int m = input.nextInt();
        System.out.print("enter the day of the month : 1-31 : ");
        int q = input.nextInt();
        int k = year % 100;
        int j = Math.abs(year / 100);
        if ( m > 12 ) {
            m = m - 12;
            year = year - 1;
        }
        int h = (q + 26 * (m + 1) /10 + k + k / 4 + j / 4 + 5 * j) % 7;
        if ( h == 0 )
            System.out.println("Day of the week is Saturday");
        else if ( h == 1 )
            System.out.println("Day of the week is Sunday");
        else if ( h == 2 )
            System.out.println("Day of the week is Monday");
        else if ( h == 3 )
            System.out.println("Day of the week is Tuesday");
        else if ( h == 4 )
            System.out.println("Day of the week is Wednesday");
        else if ( h == 5 )
            System.out.println("Day of the week is Thursday");
        else 
            System.out.println("Day of the week is Friday");
    }
}

