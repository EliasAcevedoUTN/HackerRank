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
public class Cavity_Map {
    
    static String[] cavityMap(String[] grid) {
        for(int i = 1; i < grid.length - 1; i++){
            String cadena = grid[i];
            String cadenaUp = grid[i-1];
            String cadenaDown = grid[i+1];
            for(int j = 1; j < grid.length - 1; j++){
                if(Integer.parseInt(String.valueOf(cadena.charAt(j))) > Integer.parseInt(String.valueOf(cadena.charAt(j - 1))) &&
                        Integer.parseInt(String.valueOf(cadena.charAt(j))) > Integer.parseInt(String.valueOf(cadena.charAt(j + 1))) && 
                        Integer.parseInt(String.valueOf(cadena.charAt(j))) > Integer.parseInt(String.valueOf(cadenaUp.charAt(j))) && 
                        Integer.parseInt(String.valueOf(cadena.charAt(j))) > Integer.parseInt(String.valueOf(cadenaDown.charAt(j)))) {
                    String replace = cadena.replace(cadena.charAt(j), 'X');
                    grid[i] = replace;
                }
            }
        }
        String[] result = grid; 
        return result;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = {"1112","1912","1892","1234"};

//        for (int i = 0; i < n; i++) {
//            String gridItem = scanner.nextLine();
//            grid[i] = gridItem;
//        }

        String[] result = cavityMap(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
    
}

