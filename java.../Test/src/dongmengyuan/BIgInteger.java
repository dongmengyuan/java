package dongmengyuan;

import java.math.BigInteger;

/**
 * Created by dongmengyuan on 16-11-18.
 */

public class BIgInteger {
    public static void main(String[] args) {
        BigInteger  s = new BigInteger("9223372036854775807");
        BigInteger a = new BigInteger("5");
        int i = 0;
        while(true) {
            s = s.add(BigInteger.ONE);
            if(s.mod(a).compareTo(BigInteger.ZERO) == 0) {
                i++;
                System.out.println(s);
            }
            if(i == 3)
                break;
        }
    }
}
