package miPrincipal;
class AppFactorial{
    public static void menu() {
        //Calcular factorial de un numero
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           FACTORIAL           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int f = 5;
        System.out.println("\n~~~~ Version Iterativa ~~~~ ");
        System.out.println("Factorial del " + f + "! = " +  factorialIte(f)) ;
        System.out.println("~~~~ Version Recursiva ~~~~ ");
        System.out.println("Factorial del " + f + "! = " +  factorialRecu(f));
    }

    public static long factorialIte(int n){
         //VERSION ITERATIVA
        long fact = 1;

        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static long factorialRecu(int n){

        if(n == 0)
            return 1;
        else
            return factorialRecu(n-1) * n;
    }
}