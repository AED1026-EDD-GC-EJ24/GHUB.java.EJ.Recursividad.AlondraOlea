package miPrincipal;
import java.util.*;
public class AppNaturales {
public static void menu() {
    

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("         NUMEROS NATURALES       ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar Número: ");
    int n = leer.nextInt();
    System.out.println("\n~~~~ Version Iterativa ~~~~ ");
    muestraNaturalesIte(n);
    System.out.println("~~~~ Version Recursiva ~~~~ ");
    muestraNaturalesRec(n);
    
} 
    public static void muestraNaturalesIte(int n){
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void muestraNaturalesRec(int n){
        System.out.println(n); //cuando esra antes de la invocacion recursiva dr imprime de forma decendente

        if(n > 0)
            muestraNaturalesRec(n-1);
        System.out.println(n); //Cuando esta despues de la invocacion recursiva se imprime de forma ascendente
    }
}
