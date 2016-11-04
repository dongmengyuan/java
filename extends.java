package dmy; 

import java.util.Date;


class Geometricobject {
	private String color = "white";
	private String filled = "false";
	private Date dataCreated = new Date();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFilled() {
		return filled;
	}
	public void setFilled(String filled) {
		this.filled = filled;
	}
	public String toSTring() {
		return "create on" + dataCreated + "color:" + color +"and filled: " + filled;
	}
}


class Triangle extends Geometricobject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	public Triangle() {
		
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {                                           
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		return Math.sqrt(this.getPerimeter()/2 * (this.getPerimeter()/2 - this.side1) * (this.getPerimeter()/2 - this.side2) * (this.getPerimeter()/2 - this.side3));
	}
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	public String toString() {
		return "Triangle:side1+  "+ side1 + "side2= " + side2 + "side3= " +side3;  
 	}
}

public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(1,1.5,1);
		triangle.setColor("yellow");
		triangle.setFilled("true");
		System.out.println("area:" + triangle.getArea());
		System.out.println("Perimeter:" + triangle.getPerimeter());
		System.out.println("color:" + triangle.getColor());
		System.out.println("isfilled:" + triangle.getFilled());
	} 

}

