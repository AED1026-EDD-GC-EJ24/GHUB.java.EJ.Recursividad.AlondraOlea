package miPrincipal;
public class AppLadrillos {

    //Recursividad pared de ladrillos
    public static void menu() {
        //Solucion iterativa
        for (int i = 0; i < 10; i++) {
            dibujarHilera();
        }

        //Solucion recursiva
        dibujarPared();
    }

    public static void dibujarPared(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");

    }

    public static void dibujarHilera(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    
}