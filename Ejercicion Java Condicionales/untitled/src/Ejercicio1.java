package Condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        int nota1 = n1.nextInt();
        System.out.println("Ingrese la segunda nota");
        int nota2 = n2.nextInt();
        System.out.println("Ingrese la tercera nota");
        int nota3 = n3.nextInt();

        double calculo = (nota1+nota2+nota3)/3;

        if(calculo>=6){
            System.out.println("El alumno aprobo la materia, su promedio es: "+calculo);
        }else{
            System.out.println("El alumno no aprobo la materia, su promedio es: "+calculo);
        }



    }
}
