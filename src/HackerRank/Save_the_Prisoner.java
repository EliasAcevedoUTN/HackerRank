package HackerRank;

import java.util.*;

/**
 *
 * @author Elías Acevedo
 */
public class Save_the_Prisoner {
    
    static int saveThePrisoner(int n, int m, int s) {
        int a = s+m-1;   
        if(a>n){
            if(a%n==0){
                return n;
            }
            return a%n;
        }
        return a;

    }

    public static void main(String[] args)  {

        int n = 715950220 ;

        int m = 876882456 ;

        int s = 195550680;

        int result = saveThePrisoner(n, m, s);
        
        System.out.println(result);

    }   
    
}
