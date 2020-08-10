package HackerRank;
import java.io.*;
import java.util.*;
/**
 *
 * @author Elías Acevedo
 */
public class Designer_PDF_Viewer {
    
    static int designerPdfViewer(int[] h, String word) {
        int result = 0;
        int maxLetter = 0;
        char [] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] posiciones = new int[word.length()];
        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < letras.length; j++){
                if (word.charAt(i) == letras[j]){
                    posiciones[i] = j;
                }
            }
            if (h[posiciones[i]] > maxLetter){
                maxLetter = h[posiciones[i]];
            }
        }
        result = maxLetter * word.length();
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
    
}
