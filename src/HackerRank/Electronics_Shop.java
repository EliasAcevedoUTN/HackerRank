package HackerRank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author Elías Acevedo
 */
public class Electronics_Shop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int total = 0;
        int totalMax = -1;
        for (int i = 0; i < keyboards.length; i++){
            for (int j = 0; j < drives.length; j++){
                total = keyboards[i] + drives[j];
                if (total <= b){
                    if (total > totalMax) {
                        totalMax = total;
                    }
                }
            }
        }
        return totalMax;
    }

    public static void main(String[] args)  {

        int b = 60;

        int[] keyboards = {40,50,60};

        int[] drives = {5,8,12};
        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);
        
        System.out.println(moneySpent);
    }
}
