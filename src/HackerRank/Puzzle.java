/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.math.BigInteger;

/**
 *
 * @author Elías Acevedo
 */
public class Puzzle {

    final static BigInteger M = new BigInteger("2017");

    private static BigInteger compute(long n) {
        String s = "";
        for (long i = 0; i < n; i++) {
            s = s + n;
        }
        return new BigInteger(s.toString()).mod(M);
    }
    private static BigInteger modulo(Long n) {
        String numero = String.valueOf(n);
        return new BigInteger(numero).mod(M);
    }

    public static void main(String args[]) {
//        for (long i = 58184241583791680L; i > 0; i++) {
//            System.out.println("" + i + ": " + modulo(i));
//            Integer numero = compute(i).intValue();
//            if (numero == 57) break;
//        }

        System.out.println((58184241583791680D)/(2017));
    }

}

/*
for (int i = 2; i > 0; i++) {
            System.out.println("" + i + ": " + compute(i));
            Integer numero = compute(i).intValue();
            if (numero == 1) break;
        }
*/