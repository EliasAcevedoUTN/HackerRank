package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int panes = 0;
        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
            sum += B[i];
        }
        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < B.length - 1; i++) {
                if (B[i] % 2 != 0) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    panes += 2;
                } else {
                    continue;
                }
            }
            System.out.println(panes);
        }
    }
}
