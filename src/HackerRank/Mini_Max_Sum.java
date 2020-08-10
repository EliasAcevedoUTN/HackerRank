
public class Mini_Max_Sum {
	static public int[] burbuja(int[] arreglo) {
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < arreglo.length; i++) {
                //si este par no esta ordenado
                if (arreglo[i - 1] > arreglo[i]) {
                    //los intercambiamos y recordamos que algo ha cambiado
                    int aux = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = aux;
                    intercambio = true;
                }
            }
        } while (intercambio);
        return arreglo;
    }
	public static void main(String[] args) {
		System.out.println();
	}
}
