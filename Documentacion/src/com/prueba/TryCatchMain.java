package com.prueba;

public class TryCatchMain {
    public static void main(String[] args) {


        int a=10;
        int b= 0;
        int result;
        try {
            result= a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Cierre de recursos");
        }
        System.out.println("fin");


    }
}
