package miPrincipal;
import java.util.*;
public class AppFibRecursivoOptimizado {

   public static void menu() {
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("       OPTIMIZANDO FIBONACCI         ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    Scanner leer = new Scanner(System.in);

    //inicializar la tabla
    Hashtable <Integer, Double > t = new Hashtable<Integer, Double>();
    t.put(1, 1d); // 1d -> convertido a double
    t.put(2, 1d);// 1d -> convertido a double

    //Solicitar ingresar el valor de n
    System.out.println("¿ Cuantos terminos quiere ver ?");
    int n = leer.nextInt();
    for(int i = 1; i <= n; i++){
        double f = AppFibonacci.fibonacciRecOptimizado(i, t);
        System.out.println("Fib(" + i + ") = " + f);
    }
    }
}
