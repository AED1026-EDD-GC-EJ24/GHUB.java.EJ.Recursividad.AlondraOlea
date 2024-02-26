package miPrincipal;
public class AppLadrillos {

    //Recursividad pared de ladrillos
    public static void menu() {
        /*Solucion iterativa
        for (int i = 0; i < 10; i++) {
            dibujarHilera();
        }
        */
        //Solucion recursiva
        int n = 10;
        dibujarPared(n);
    }

    public static void dibujarPared(int n){

        if (n > 0)
            dibujarPared(n-1);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");

    }

    public static void dibujarHilera(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    
}