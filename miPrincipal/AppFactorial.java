package miPrincipal;
class AppFactorial{
    public static void main(String[] args) {
        //Calcular factorial de un numero
        int f = 5;
        System.out.println("Factorial del " + f + "! = " +  factorialIte(f));
    }

    public static long factorialIte(int n){
         //VERSION ITERATIVA
        int f = 5;
        long fact = 1;

        for (int i = f; i > 0; i--) {
            fact = fact *i;;
        }
        return fact;
    }
    public static long factorialRecu(int n){

        if(f == 0)
            return 1;
        else
            return factorialRecu(f-1) * f;
    }
}