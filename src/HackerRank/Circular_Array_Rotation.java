package HackerRank;

import java.io.*;

/**
 *
 * @author Elías Acevedo
 */
public class Circular_Array_Rotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] rotada = a;
        if (rotada.length == k) {
            int[] result = new int[queries.length];
            for (int i = 0; i < result.length; i++) {
                int aux = queries[i];
                result[i] = rotada[aux];
            }
            return result;
        } else {
            int rotar = 1;
            do {
                int ultimo = rotada[a.length - 1];
                for (int i = a.length - 2; i >= 0; i--) {
                    rotada[i + 1] = rotada[i];
                }
                rotar++;
                rotada[0] = ultimo;
                if (rotar > k) {
                    break;
                }
            } while (true);
            int[] result = new int[queries.length];
            for (int i = 0; i < result.length; i++) {
                int aux = queries[i];
                result[i] = rotada[aux];
            }
            return result;
        }

    }

    public static void main(String[] args) throws IOException {

        int k = 2;

//        int q = Integer.parseInt(nkq[2]);
        int[] a = {1, 2, 3, 4, 5, 6};

//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
        int[] queries = {0, 1, 2};

//        for (int i = 0; i < q; i++) {
//            int queriesItem = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//            queries[i] = queriesItem;
//        }
        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }

}
