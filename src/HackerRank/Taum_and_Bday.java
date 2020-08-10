package HackerRank;

import java.math.*;

/**
 *
 * @author Elías Acevedo
 */
public class Taum_and_Bday {

    public static BigInteger taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        BigInteger total = BigInteger.valueOf(0);
        BigInteger b1 = BigInteger.valueOf(b);
        BigInteger w1 = BigInteger.valueOf(w);
        BigInteger bc1 = BigInteger.valueOf(bc);
        BigInteger wc1 = BigInteger.valueOf(wc);
        BigInteger z1 = BigInteger.valueOf(z);
        BigInteger bXbc = BigInteger.ONE;
        bXbc = b1.multiply(bc1);
        BigInteger wXwc = BigInteger.ONE;
        wXwc = w1.multiply(wc1);
        BigInteger gastoNormal = BigInteger.valueOf(1);
        gastoNormal = bXbc.add(wXwc);
        BigInteger bpW = BigInteger.valueOf(1);
        bpW = b1.add(w1);
        BigInteger bwbc = BigInteger.ONE;
        bwbc = bpW.multiply(bc1);
        BigInteger wXz = BigInteger.ONE;
        wXz = w1.multiply(z1);
        BigInteger bConversion = BigInteger.valueOf(1);
        bConversion = bwbc.add(wXz);
        BigInteger bwwc = BigInteger.ONE;
        bwwc = bpW.multiply(wc1);
        BigInteger bXz = BigInteger.ONE;
        bXz = b1.multiply(z1);
        BigInteger wConversion = BigInteger.valueOf(1);
        wConversion = bwwc.add(bXz);
        if(gastoNormal.compareTo(bConversion) == 1 && gastoNormal.compareTo(wConversion) == 1){
            if (bConversion.compareTo(wConversion) == 1 ){
                total = wConversion;
            } else {
                total = bConversion;
            }
        } else if (bConversion.compareTo(wConversion) == 1) {
            if (wConversion.compareTo(gastoNormal) == 1){
                total = gastoNormal;
            } else {
                total = wConversion;
            }
        } else {
            if(bConversion.compareTo(gastoNormal) == 1) {
                total = gastoNormal;
            } else {
                total = bConversion;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        int b = 3;

        int w = 6;

        int bc = 9;

        int wc = 1;

        int z = 1;

        BigInteger result = taumBday(b, w, bc, wc, z);

        System.out.println(result);
    }

}
