package com.String;

public class ClaseString {
    public static void main(String[] args) {

        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("la longuitud de la cadena es: " + cadena);
        String cadenaMayusc = cadena.toUpperCase();
        System.out.println(cadenaMayusc);
        String cadenaMinusc = cadena.toLowerCase();
        System.out.println(cadenaMinusc);

        boolean resultado = cadena.startsWith("Men");
        if (resultado) {
            System.out.println("La cadena empieza por  lo que estoy buscando");
        } else {
            System.out.println("La cadena NO empieza por lo que estoy buscando");
        }

        boolean resultado2 = cadena.endsWith("Men");
        if (resultado2) {
            System.out.println("La cadena termina por  lo que estoy buscando");
        } else {
            System.out.println("La cadena NO termina por lo que estoy buscando");
        }

        char letra = cadena.charAt(3);//indico la posicion de que caracter, sabiendo que empieza por 0
        System.out.println("Caracter es igual a: " + letra);


        for (int i = 0; i < cadena.length(); i++){

            System.out.println(cadena.charAt(i));
        }

        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >=0; i--){

            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);


    }
    }

