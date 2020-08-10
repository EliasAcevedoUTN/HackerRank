package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Elías Acevedo
 */
public class Bon_Appétit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int suma = 0;
        for (int i = 0; i < bill.size(); i++){
            if (i == k) continue;
            suma += bill.get(i);
        }
        if ((suma/2) == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (suma/2));
        }
    }

    public static void main(String[] args) {

        int n = 4;

        int k = 1;

        List<Integer> bill = Arrays.asList(3,10,2,9);

        int b = 7;

        bonAppetit(bill, k, b);

    }
}
