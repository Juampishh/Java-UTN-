

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner inputTot = new Scanner(System.in);
        System.out.println("Ingrese el total gastado");
        int tot = inputTot.nextInt();

        if (tot>=1000){
            System.out.println("Su compra es mayor a 1000 por lo que recibira un descuento del 20%");
            System.out.println("El total de su compra fue de:$"+tot);
            System.out.println("Aplicando el descuento que usted recibio:$"+(tot-(tot*20)/100));
        }

    }
}
