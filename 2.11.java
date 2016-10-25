/*************************************************************************
        > File Name: Main.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月13日 星期二 09时57分43秒
 ************************************************************************/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter employee's name:");
        string name  = input.nextString();
        System.out.print("enter number of hours worked in a week:");
        int hours = input.nextInt();
        System.out.print("enter hourly pay rate:");
        double rate = input.nextDouble();
        System.out.print("enter federal tax withholding rate:");
        double tax = input.nextDouble();
        System.out.print("enter state tax withholding rate:");
        double state = input.nextDouble();
        System.out.print("employee name:"+ name);
        System.out.print("hours worked:"+ hours);
        System.out.print("pay rate:"+ rate);
        double pay = rate * 10;
        System.out.print("gross pay:"+ pay);
        System.out.print("deductions:");
        System.out.print("  federal withholding(20.0%):"+ tax * pay);
        System.out.print("  state withholding(9.0%):"+ state * pay);
        System.out.print("  total deduction:"+ (tax * pay + state * pay));
        System.out.print("net pay:"+(pay - tax * pay + state * pay));
    }
}
