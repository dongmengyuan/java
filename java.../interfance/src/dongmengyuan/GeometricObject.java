package dongmengyuan;

import java.util.Date;


abstract class GeometricObject {

	
}

class Circle extends GeometricObject {
	
}

class Rectangle extends GeometricObject {
	
}

public class GeometricObject {
	public static double sumArea(GepmetricObject[] a) {
		double sum = 0;
		for(i = 0; i < a.length; i++) {
			sum = sum + a[i].getArea;
			
		}
		return sum;
	}
	
}
	public static void main(String[] args) {
		GeometricObject []a = {
				new Circle(1.0),new Circle(2.0),new Rectangle(2.0,3.0),new Rectangle(6.0,3.0)
		};
		
	}

}
