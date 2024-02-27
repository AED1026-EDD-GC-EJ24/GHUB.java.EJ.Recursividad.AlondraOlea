package miPrincipal;
import java.util.Scanner;
public class AppSumaDigitos {
    public static void menu() {

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("           SUMA DIGITOS         ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar Número: ");
    int n = leer.nextInt();
    System.out.println("\n~~~~ Version Iterativa ~~~~ ");
    System.out.println("Resultado = "  + sumaDigitosIterativa(n));
    System.out.println("~~~~ Version Recursiva ~~~~ ");
    System.out.println("Resultado = " + sumaDigitosRecursiva(n));
}

    public static int sumaDigitosIterativa(int n){
        int suma = 0;
        while(n > 9){
            suma = suma + n%10;
            n = n / 10;
        }
        return (suma+n);
    }
    public static int sumaDigitosRecursiva(int n){

        if(n <= 9)
            return n;
        else
            return (sumaDigitosRecursiva(n/10)+ n % 10);
    }
}
