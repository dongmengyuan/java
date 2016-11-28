package dongmengyuan;

import java.util.*;

public class Geo inplements Comparable {
	public abstract double getARea();
	public abstract double getPerimeter();
	public int comparaTo(Object o) {
		if(getARea() > o.getArea()) 
			return 1;
		else if(getArea() < o.getArea())
		    return -1;
		else 
			return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
