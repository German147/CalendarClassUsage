package com.ejemplo;

import java.util.Calendar;
import java.util.Scanner;

//Se desarrolla una clase ejecutable que solicita al usuario
// su año de nacimiento. A continuación se calcular e imprime la edad que tendrá
// el usuario a fin del año actual.
//Para obtener el año actual se utiliza la siguiente clase con su instruccion
//        Calendar.getInstance().get(Calendar.YEAR)
public class Main {

    public static void main(String[] args) {

        //iniciar Variables
        int anioNac, edad, anioActual;
        //iniciamos metodo de entrada Scanner
        Scanner input = new Scanner(System.in);

        //Instanciamos la clase Calendar a la variable AnioActual
        anioActual = Calendar.getInstance().get(Calendar.YEAR);

        //Entradas
        System.out.println("Ingrese año de nacimiento: ");
        anioNac = input.nextInt();

        //proceso
        edad = anioActual - anioNac;

        //Salida
        System.out.println("Su edad al dia de la fecha del " + anioActual + " es: " + edad);


    }
}
