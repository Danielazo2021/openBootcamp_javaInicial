package com.example;

public class IfElse {
    public static void main(String[] args) {

        boolean check= 5 < 10; // cualquier dato, que vega de variables o lo que sea

        if(check){
            System.out.println("verdadero");
        }
        if(5<10){
            System.out.println("verdadero");
        }
        int num1=5;
        int num2=10;
        int num3=20;
        if(num1<num2){
            System.out.println("verdadero");
        }
        if(num1<num2 && num2<num3){
            System.out.println("tambien es verdadero");
        }else {
            System.out.println("falso");
        }



        System.out.println("fin");

    }
}
