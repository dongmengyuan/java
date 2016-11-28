package dongmy;
import java.math.BigDecimal;

public class EXer3 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = new BigDecimal("0.1");
		BigDecimal d = new BigDecimal("0.1");
		if(a.add(b).add(c).equals(d)) {
			System.out.println("等于0.3");
		}
		else {
			System.out.println("不等于0.3");
		}
	}
}
