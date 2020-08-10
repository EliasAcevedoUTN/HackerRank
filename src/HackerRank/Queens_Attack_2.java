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
public class Queens_Attack_2 {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int ataques = 0;
        
        long[][] tablero = new long[n][n];
        tablero[n - r_q][c_q - 1] = -1;//ubico la reina
        //ahora ubico los obstaculos
        for (int i = 0 ;i < obstacles.length; i++){
            int renglon = obstacles[i][0];
            int colum = obstacles[i][1];
            tablero[n- renglon][colum -1] = -1;
        }
        //ahora calculo los posibles movimientos¿pero como?
        int renglon = n - r_q;//la posicion de la reina
        int columna = c_q - 1;
        while(true){
            renglon--;columna--;
            if (renglon < 0 || columna < 0) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            renglon--;
            if (renglon < 0 || columna < 0) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            renglon--;columna++;
            if (renglon < 0 || (columna  ) > n - 1) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            columna++;
            if (renglon < 0 || (columna  ) > n - 1) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            renglon++;columna++;
            if (renglon > n - 1 || (columna  ) > n - 1) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            renglon++;
            if (renglon > n - 1 || (columna  ) > n - 1) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            renglon++;columna--;
            if (renglon < 0 || renglon > n -1 || columna  < 0) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        renglon = n - r_q;//la posicion de la reina
        columna = c_q - 1;
        while(true){
            columna--;
            if (columna < 0) break;
            if (tablero[renglon][columna] == -1) break;
            else { ataques++;}}
        
        return ataques;
    }


    public static void main(String[] args) throws IOException {

        int n = 100000;

        int k = 0;
        
        int r_q = 4187;

        int c_q = 5068;

        int[][] obstacles = {{5,5},{4,2},{2,3}};

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(result);
    }
}
