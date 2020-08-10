package HackerRank;
/**
 *
 * @author Elías Acevedo
 */
public class Viral_Advertising {
    static int viralAdvertising(int n) {
        int viralTotal = 0;
        int viralParcial = 5;
        int contador = 1;
        do {
            viralParcial = (viralParcial/2);
            viralTotal += viralParcial;
            viralParcial*=3;
            contador++;
        } while (contador <= n);
        return viralTotal;
    }

    public static void main(String[] args)  {
        
        int n = 3;

        int result = viralAdvertising(n);
        
        System.out.println(result);
    }
}
