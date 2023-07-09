package com.example;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo();
        holaMundo();
        holaMundo("Daniel");
    }

    private static void holaMundo() {
        System.out.println("hola mundo desde un metodo");
    }
    public static void holaMundo(String name) {
        System.out.println("hola mundo desde un metodo "+ name + " lo lograste!!");
    }

    protected static void holaMundo(int cantidad) {
        System.out.println("hola mundo desde un metodo "+ cantidad + " lo lograste!!");
    }

    public static int Suma(int a , int b){
        return  a+b;
    }
}
