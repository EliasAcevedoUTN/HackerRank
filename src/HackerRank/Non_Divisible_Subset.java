package HackerRank;
import java.io.*;
import java.util.*;
/**
 *  SIN TERMINAR TODAVIA
 * @author Elías Acevedo
 */
public class Non_Divisible_Subset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int posibles = 0;
        Set<Integer> conjunto = new HashSet<>();
        for (int i = 0; i < s.size() - 1; i++){
            for (int j = i+1; j < s.size(); j++){
                if (((s.get(i)+s.get(j))%k) != 0){
                    conjunto.add(s.get(i));
                    conjunto.add(s.get(j));
                } else {
                    conjunto.remove(s.get(i));
                    conjunto.remove(s.get(j));
                }
            }
        }
        return posibles = conjunto.size();
    }
    public static void main(String[] args) throws IOException {

        int n = 4;

        int k = 5;

        List<Integer> s = Arrays.asList(770528134, 663501748 ,384261537, 800309024 ,103668401 ,538539662 ,385488901, 101262949 ,557792122 ,46058493);

        int result = nonDivisibleSubset(k, s);
        
        System.out.println(result);
    }
}
