package com.prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre=sc.nextLine();

        System.out.println("Bienvenido: "+nombre);

        System.out.println("Ingresa su edad");
        int edad =sc.nextInt();
        if(edad>30){
            System.out.println("Tranquilo, nunca es tarde para aprender");
        }else
            if(edad>15 && edad<=30) {
            System.out.println("Una buena edad para aprender");
            }else {
                System.out.println("Debes tener mas de 15 años para empezar a aprender esto");
            }
    }
}
