

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner mayor = new Scanner(System.in);
        Scanner menor = new Scanner(System.in);
        System.out.println("Ingrese la edad de el hermano mayor");
        int Hmayor = mayor.nextInt();
        System.out.println("Ingrese la edad de el hermano menor");
        int Hmenor = menor.nextInt();
        int diferencia = Hmayor-Hmenor;
        System.out.println("Se llevan "+diferencia+" años de diferencia");

    }
}
