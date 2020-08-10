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
public class StrangeCounter {
    
    static long strangeCounter(long t) {
        long result = 0;
        long tiempo = 3;
        while (t > tiempo) {
            t =  t - tiempo;
            tiempo*=2;
        }
        return result = (tiempo - t + 1);
    }

    public static void main(String[] args) throws IOException {

        long t = 16;

        long result = strangeCounter(t);

        System.out.println(result);
    }
    
}
