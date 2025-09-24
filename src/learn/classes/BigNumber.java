package learn.classes;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        BigInteger c = a.add(b);

        /*
        operator yang sering di pakai di BigInteger dan BigDecimal
        add -> +
        substract -> -
        multiply -> *
        divide -> /
        mod -> %
        dll
         */
        System.out.println(c);
    }
}
