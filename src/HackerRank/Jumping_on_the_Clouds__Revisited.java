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
public class Jumping_on_the_Clouds__Revisited {
    static int jumpingOnClouds(int[] c, int k) {
        int poder = 100;
        for (int i = k; i < c.length; i += k){
            if (c[i] == 1){
                poder -= 3;
            } else {
                poder -= 1;
            }
        }
        return poder;
    }

    public static void main(String[] args)  {

        int k = 2;

        int[] c = {0,0,1,0,0,1,1,0};

        int result = jumpingOnClouds(c, k);

        System.out.println(result);
    }
}
