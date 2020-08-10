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
public class Picking_Numbers {

    public static int pickingNumbers(List<Integer> a) {
        int largo = 0;
        int largoMaximo = -1;
            for (int k = 0; k < a.size(); k++) {
                List<Integer> listaMayor = new ArrayList<>();
                List<Integer> listaMenor = new ArrayList<>();
                listaMayor.add(a.get(k));
                listaMenor.add(a.get(k));
                for (int j = 0; j < a.size(); j++) {
                    if (k == j) {
                        continue;
                    }
                    if ((a.get(k) - a.get(j)) < 0 && (a.get(k) - a.get(j)) > -2) {
                        listaMayor.add(a.get(j));
                    } else if ((a.get(k) - a.get(j)) > 0 && (a.get(k) - a.get(j)) < 2) {
                        listaMenor.add(a.get(j));
                    }
                    if ((a.get(k) - a.get(j)) == 0) {
                        listaMayor.add(a.get(j));
                        listaMenor.add(a.get(j));
                    }
                    //Agrego la mayor lista al resultado
                    if (listaMayor.size() >= listaMenor.size()) {
                        largo = listaMayor.size();
                    } else if (listaMayor.size() <= listaMenor.size()) {
                        largo = listaMenor.size();
                    }
                    //ahora comparo con la lista anterior
                    if (largo >= largoMaximo) {
                        largoMaximo = largo;
                    }
                }
            }

        return largoMaximo;
    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4 ,4, 97, 5, 5, 5, 4, 97 ,97, 4 ,97, 5, 4 ,4 ,97, 97, 97 ,5, 5, 97, 4 ,97 ,97, 5 ,4 ,97, 97, 4, 97, 97, 97 ,5, 4 ,4 ,97, 4 ,4 ,97 ,5 ,97 ,97 ,97 ,97 ,4 ,97, 5 ,97, 5, 4 ,97, 4, 5 ,97, 97, 5, 97, 5, 97, 5, 97, 97, 97);

        int result = pickingNumbers(a);

        System.out.println(result);
    }

}
