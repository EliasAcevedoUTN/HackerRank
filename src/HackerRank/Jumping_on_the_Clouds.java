package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Elías Acevedo
 */
public class Jumping_on_the_Clouds {
    static int jumpingOnClouds(int[] c) {
        int salto = 0;
        int i = 0;
        while (i < c.length - 1) {
            if ( i + 2 == c.length || c[ i + 2] == 1){
                i++;
                salto++;
            } else {
                i+=2;
                salto++;
            }
        }
        return salto;
    }

    public static void main(String[] args)  {

        int[] c = {0,0,0,1,0,0};

        int result = jumpingOnClouds(c);

        System.out.println(result);
    }
}
