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

public class Migratory_Birds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int avesActual = 0;//numero de lista actual
        int cantidadActual = -1;//cuan grande es la lista
        int avesMax = 10;//lista maxima
        int cantidadMaxima = -1;//cuan grande es la cantidad de la lista maxima
        int aves = 1;
        do {
            cantidadActual = 0;
            avesActual = aves;
            for(int i = 0; i < arr.size(); i++){
                if( aves == (arr.get(i))) cantidadActual++;                
            }
            if (cantidadActual > cantidadMaxima) {
                cantidadMaxima = cantidadActual;
                avesMax = avesActual;
            } else if (cantidadActual == cantidadMaxima){
                if(avesActual < avesMax){
                    avesMax = avesActual;
                }
            }
            aves++;
        } while (aves <= 5);
        
        return avesMax;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);

        int result = migratoryBirds(arr);

        System.out.println(result);
    }
}
