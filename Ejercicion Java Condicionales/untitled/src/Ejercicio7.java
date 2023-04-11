package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){


        double precio = 578.899;
        int clave1 = 1;
        int clave2 = 2;
        System.out.println("-------------------------------");
        System.out.println("RTX 4090 OC DDR6");
        System.out.println("-------------------------------");
        System.out.println("Ingrese el la clave de descuento: ");
        Scanner inputClave = new Scanner(System.in);
        int clave = inputClave.nextInt();
        if(clave == 1){
            System.out.println("Selecciono la clave 1, tiene un descuento del 10%");
            System.out.println("El precio real del producto era de: $"+precio);
            System.out.println("Con el descuento aplicado: $"+(precio-precio*0.1));
        }else if (clave == 2){
            System.out.println("Selecciono la clave 2, tiene un descuento del 20%");
            System.out.println("El precio real del producto era de: $"+precio);
            System.out.println("Con el descuento aplicado: $"+(precio-precio*0.2));
        }else{
            System.out.println("Error numero ingresado incorrecto");
            System.out.println("Ingrese 1 o 2");
        }


    }
}
