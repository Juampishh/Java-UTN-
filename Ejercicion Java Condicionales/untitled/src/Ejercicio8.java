package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = num.nextInt();
        System.out.println("Ingrese el segundo numero");
        double numero2 = num2.nextInt();

        if(numero1==numero2){
            System.out.println("El valor es: "+numero1*numero2);
        } else if (numero1>numero2) {
            System.out.println("El valor es: "+(numero1-numero2) );
        }else{
            System.out.println("El valor es: "+(numero1+numero2) );
        }


    }
}
