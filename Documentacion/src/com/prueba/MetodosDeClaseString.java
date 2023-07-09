package com.prueba;

public class MetodosDeClaseString {
    public static void main(String[] args) {


        //la clase String
    /*
    length()
    startWith("")
    endsWith("")
    indexOf("")
    subString(1,5)
    trim()
    equals()
    compareTo
     */

        String mensaje = "  Hola Danielazo  ";
        System.out.println(mensaje.length());

        System.out.println(mensaje.toUpperCase());
        String mesajeMAY= mensaje.toUpperCase();
        System.out.println(mesajeMAY.trim());
        String otroMensaje= "Hoal mundo";
        if(mesajeMAY.equals(otroMensaje))
        {
            System.out.println("Son iguales");
        };


    }
}
