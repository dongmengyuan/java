/*************************************************************************
        > File Name: Distance.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月18日 星期日 08时29分23秒
 ************************************************************************/

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance;
        distance = Math.pow((Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2)) , 0.5);
        System.out.println("the distance of the two points is " + distance);
    }

}

