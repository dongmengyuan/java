package dongmy;

import java.math.BigDecimal;

public class EXer2 {
	
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("0.8");
		BigDecimal c = a.subtract(b);
		System.out.println(c);
	}
	
}
