package HackerRank;
import java.util.*;

public class Between_Two_Sets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int total = 0;
        int divisible = 0;
        int extremoB = a.get(a.size()-1);
        int extremoC = b.get(0);
        for ( int i = extremoB; i <= extremoC; i++){
            for (int j = 0; j < a.size(); j++){
                if (i%a.get(j) == 0) divisible++;
            }
            if (divisible == a.size()){
                divisible = 0;
                for (int k = 0; k < b.size(); k++){
                    if (b.get(k)%i == 0) divisible++;
                }
                if (divisible == b.size()) total++;
            }
            divisible = 0;
        }
        return total;
    }
    public static void main(String[] args)  {

        List<Integer> arr = Arrays.asList(2,4);

        List<Integer> brr = Arrays.asList(16,32,96);

        int total = getTotalX(arr, brr);

        System.out.println(total);
    }
}
