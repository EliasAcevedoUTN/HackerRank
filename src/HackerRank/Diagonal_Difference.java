package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.naming.spi.DirStateFactory.Result;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Diagonal_Difference {
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	int resultado = 0;
    	//List<Integer> orden = arr.get(0);//obtengo la primer lista que es donde se almancena el orden de la matriz
    	//int ordenArreglo = orden.get(0);//obtengo el orden de la matriz
    	int primerDiagonal = 0;
    	int segundaDiagonal = 0;
    	for (int i = 0 ; i <= arr.size(); i++ ) {
    		for (int j = 0; j < arr.size(); j++) {
    			List<Integer> aux = arr.get(i);
    			int dato = aux.get(j);
    			if ((i - 1) == j) {
    				primerDiagonal += dato;
    			} 
    			if ((i + j) == arr.size() ) {
    				segundaDiagonal += dato;
    			}
    		}
    	}
    	resultado = Math.abs(primerDiagonal - segundaDiagonal); 
    	return resultado;
        /*public static int diagonalDifference(List<List<Integer>> arr) {
    int leftToRight=0;
    int rightToLeft=0;
    for(int i=0, j=arr.get(0).size()-1;i<arr.get(0).size();i++,j--){
        leftToRight+=arr.get(i).get(i);
        rightToLeft+=arr.get(i).get(j);
    }
    
    return (leftToRight>rightToLeft?(leftToRight-rightToLeft):(rightToLeft-leftToRight));
    }*/
    }
    public static void main(String[] args) {
    	List<List<Integer>> lista = new ArrayList<>();
    	List<Integer> orden = new ArrayList<>();
    	int ordenArreglo = 3;
    	orden.add(ordenArreglo);
    	lista.add(orden);
    	List<Integer> lista1 = new ArrayList<>();
    	List<Integer> lista2 = new ArrayList<>();
    	List<Integer> lista3 = new ArrayList<>();
    	Integer listaa1[] = {11,2,4};
    	Integer listaa2[] = {4,5,6};
    	Integer listaa3[] = {10,8,-12};
    	lista1 = Arrays.asList(listaa1);
    	lista2 = Arrays.asList(listaa2);
    	lista3 = Arrays.asList(listaa3);
    	lista.add(lista1);
    	lista.add(lista2);
    	lista.add(lista3);
    	System.out.println(diagonalDifference(lista));
    }
}

