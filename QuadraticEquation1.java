/*************************************************************************
        > File Name: QuadraticEquation1.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月29日 星期四 17时30分54秒
 ************************************************************************/

import java.util.Scanner;

class QuadraticEquation {
    private int a,b,c;
    QuadraticEquation(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int getA() {
        return a;
    }
    int getB() {
        return b;
    }
    int getC() {
        return c;
    }
    int getDiscriminant() {
        return b * b - 4 * a * c;
    }
    double getRoot1() {
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r1;
    }
    double getRoot2() {
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r2;
    }
}

public class QuadraticEquation1 {
    public static void main(String[] args) {
        System.out.println("please input a,b,c:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation m = new QuadraticEquation(a,b,c);
        if (m.getDiscriminant() > 0) {
            System.out.println("两个根: " + m.getRoot1() + "\t\t" + m.getRoot2());
        }
        else if (m.getDiscriminant() == 0) {
            System.out.println("一个根: " + m.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }

    }
}

