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
public class Pangrams {
    static String pangrams(String s) {
        String es = ""; int contador = 27;
        List<Character> abc =Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        Set<Character> aux = new HashSet<>();
        String cadena = s.trim().toLowerCase();
        for (int i = 0; i < cadena.length(); i++){
            for (int j = 0; j < abc.size(); j++){
                if (cadena.charAt(i) == abc.get(j)){
                    aux.add(abc.get(j));
                }
            }
        }
        if (aux.size() == 26) {
            es = "pangram";
        } else {
            es = "not pangram";
        }
        return es;
    }

    public static void main(String[] args) {

        String s = "We promptly judged antique ivory buckles for the next prize";

        String result = pangrams(s);

        System.out.println(result);
    }
}
