package miPrincipal;
import java.util.*;
public class AppFibonacci {

    private static long cont;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        SERIE DE FIBONACCI      ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int n = leer.nextInt();

        System.out.println("~~~~~~ VERSIÓN ITERATIVA ~~~~~~");
        double f = fibonacciIte(n);
        System.out.println(f);

        System.out.println("~~~~~~ VERSIÓN RECURSIVO ~~~~~~");
        f = fibonacciRec(n);
        System.out.println(f);

    }
    static double fibonacciIte(int n) {
        double f = 1, r1 = 1, r2 = 1;
        for(int i = 3; i <= n; i++){
            f = r1 +r2;
            r1 = r2;
            r2 = f;
        }
        return f;
 }
    static double fibonacciRec(int n) {
        cont ++;
        double f;
        if(n <= 2)
            f = 1;
        else
            f = fibonacciRec(n-1) + fibonacciRec(n-2);
        return f;
    }
    static long getContador(){
        return cont;
    }
    static double fibonacciRecOptimizado(int x, Hashtable < Integer, Double > t){

        //primero verificamos si el resultado esta en la tabla 
        Double d = t.get(x);
        // si no estaba entonces lo calculamos y lo ingresamos a la tabla
        if(d == null){
            d = fibonacciRecOptimizado(x-1, t) + fibonacciRecOptimizado(x-2, t);
            t.put(x, d);
        }
        //retornamos el resultado
        return d;
    }
}
