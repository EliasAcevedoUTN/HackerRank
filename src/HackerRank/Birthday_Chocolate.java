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

public class Birthday_Chocolate {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int resultado = 0;
        int contador = 0;
        
        List<Integer> aux = new ArrayList<>();
        do {
            int suma = 0;
            for (int i = contador; i < contador + m; i++ ){
                aux.add(s.get(i));
                suma += s.get(i);
            }
            if (suma == d){
                resultado++;
            }
            contador++;
        } while ((contador + m) <= s.size() );
        return resultado;
    }

    public static void main(String[] args) {
        
        List<Integer> s = Arrays.asList(2,1,4,1,3,3,4,2,1);

        int d = 18;

        int m = 7;

        int result = birthday(s, d, m);
        System.out.println(result);
    }
}
