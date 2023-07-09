package com.prueba;

import com.example.Funciones;

public class PruebaFunciones {
    public static void main(String[] args) {
        Funciones.holaMundo("Pedrito");
        Funciones.holaMundo("8");// no puedo usar el numero como int , se lo paso como string
        // porque el metodo protected no me deja acceder desde diferentes paquetes , solo clases hijas y del mismo paquete
        System.out.println(Funciones.Suma(8,9));
    }
}
