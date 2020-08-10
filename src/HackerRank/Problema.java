package HackerRank;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Elías Acevedo
 */
public class Problema {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar valor: ");
        BigInteger valor = new BigInteger(entrada.nextLine());
        BigInteger modulo = valor.mod(new BigInteger("2017"));
        Integer numero = modulo.intValue();
        BigInteger encontrado;
        if (numero > 0){
            encontrado = encontrarValor(modulo);
        } else {
            encontrado = encontrarValor(valor);
        }
        System.out.println(encontrado);
    }
    
    public static BigInteger encontrarValor(BigInteger n){
        if (n.equals(new BigInteger("1"))){
            return new BigInteger("1");
        } else if (n.equals(new BigInteger("2"))){
            return new BigInteger("2");
        } else if (n.equals(new BigInteger("3"))){
            return new BigInteger("3"); 
        } else {            
            BigInteger primer = new BigInteger("1");
            BigInteger segundo = new BigInteger("2");
            BigInteger tercer = new BigInteger("3");
            BigInteger valor = primer.add(segundo).add(tercer);
            BigInteger posicion = new BigInteger("4");            
            do {
                if (n.equals(posicion)) break;
                posicion = posicion.add(new BigInteger("1"));
                primer = segundo;
                segundo = tercer;
                tercer = valor;
                valor = tercer.add(segundo).add(primer);
            } while (true);
            return valor;
        }
    }
}
