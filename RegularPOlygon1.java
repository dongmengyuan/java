/*************************************************************************
        > File Name: RegularPOlygon1.java
      > Author: dongmengyuan
      > Mail: 1322762504@qq.com
      > Created Time: 2016年09月29日 星期四 16时39分35秒
 ************************************************************************/


class RegularPOlygon {
    private int n = 3;
    private double side = 1;
    private double x  = 0;
    private double y = 0;
    public RegularPOlygon() {

    }
    RegularPOlygon(int n,double size) {
        this.n = n;
        this.side = size;
        x = 0;
        y = 0;
    }
    RegularPOlygon(int n,double size,double x,double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    int getN() {
        return n;
    }
    double getSide() {
        return side;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    double getPerimeter() {
        return n * side;
    }
    double getArea() {
        return (n * side *side) / (4 * Math.tan(getPerimeter() / n) );
    }
}

public class RegularPOlygon1 {
    public static void main(String[] args) {
        RegularPOlygon polygon1 = new RegularPOlygon();
        System.out.println("polygon1 周长: " + polygon1.getPerimeter() +" 面积: " + polygon1.getArea());
        RegularPOlygon polygon2 = new RegularPOlygon(6,4);
        System.out.println("polygon2 周长: " + polygon2.getPerimeter() + " 面积: " + polygon2.getArea());
        RegularPOlygon polygon3 = new RegularPOlygon(10,4,5.6,7.8);
        System.out.println("polygon3 周长: " + polygon3.getPerimeter() + " 面积: " + polygon3.getArea());
    }
}

