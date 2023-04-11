

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args){

            Scanner numIn = new Scanner(System.in);
            System.out.println("Ingrese un numero entero entre 1 y 10");
            int num = numIn.nextInt();


            switch (num) {
                case 1:
                    System.out.println("El numero que ingreso representado en romano es: I ");
                    break;
                case 2:
                    System.out.println("El numero que ingreso representado en romano es: II ");
                    break;
                case 3:
                    System.out.println("El numero que ingreso representado en romano es: III ");
                    break;
                case 4:
                    System.out.println("El numero que ingreso representado en romano es: IV ");
                    break;
                case 5:
                    System.out.println("El numero que ingreso representado en romano es: V ");
                    break;
                case 6:
                    System.out.println("El numero que ingreso representado en romano es: VI ");
                    break;
                case 7:
                    System.out.println("El numero que ingreso representado en romano es: VII ");
                    break;
                case 8:
                    System.out.println("El numero que ingreso representado en romano es: VIII ");
                    break;
                case 9:
                    System.out.println("El numero que ingreso representado en romano es: IX ");
                    break;
                case 10:
                    System.out.println("El numero que ingreso representado en romano es: X ");
                    break;


                default:
                    System.out.println("La opción elegida no es válida");
                    break;
            }

        }
}

