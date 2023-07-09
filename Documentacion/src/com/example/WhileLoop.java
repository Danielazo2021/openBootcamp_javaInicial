package com.example;

public class WhileLoop {
    public static void main(String[] args) {

        boolean chech=true;
        int count=0;

        while(count<10){

            count++;
        if(count==6){


            continue;
        }
            System.out.println("imprime desde el while, vuelta n° "+(count));
            if(count==8)  break;
        }
        System.out.println("Fin del While");


    }
}
