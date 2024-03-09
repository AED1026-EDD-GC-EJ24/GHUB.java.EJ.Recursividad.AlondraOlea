package miPrincipal;

public class AppAlfabeto {
    public static void main(String[] args) {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("              ALFABETO           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        metodoA('Z');
        System.out.println(" ");

    }

    static void metodoA(char c){
        if(c > 'A')
            metodoB(c);
            System.out.println(c);
    }

    static void metodoB(char c){
        metodoA(--c);
    }
    
}
