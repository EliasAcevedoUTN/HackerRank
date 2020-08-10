package HackerRank;

import java.util.*;

public class Cut_the_sticks {

    static int[] cutTheSticks(int[] arr) {
        int[] palos = arr;
        List<Integer> palosRestantes = new ArrayList<>();
        do {
            int mayores = 0;
            for (int j = 0; j < palos.length; j++){
                if (palos[j] > 0 ) mayores++; 
            }
            if (mayores <= 0) break;
            palosRestantes.add(mayores);
            int menor = buscarMenor(palos);
            
            for (int i = 0; i < palos.length; i++){
                palos[i] -= menor;
            }
            
        } while (true);
        int[] resto = new int[palosRestantes.size()];
        for (int i = 0; i < resto.length; i++){
            resto[i] =  palosRestantes.get(i);
        }
        return resto;
    }
    static int buscarMenor(int[] arreglo){
        int menor = 0;
        int menorActual = 0;
        boolean bandera = true;
        for (int i = 0; i < arreglo.length; i++){
            if (bandera && arreglo[i] > 0 ){
                menorActual = arreglo[i];
                bandera = false;
                continue;
            }
            if (!bandera){
                if (arreglo[i] > 0) {
                    if (arreglo[i] < menorActual) {
                        menorActual = arreglo[i];
                    }
                }
            } else {
                menorActual = -1;
            }
        }
        return menor = menorActual;
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 4, 2, 2, 8};

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
