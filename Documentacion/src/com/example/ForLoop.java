package com.example;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i%2==0 && i>0){
                System.out.println("Numero par: "+(i));
                if(i==6){
                    break; // si vale 6 suspendemos el ciclo, se puede, solo a modo de ejemplo lohice
                }
            }
           // System.out.println("texto numero: "+ (i+1));
        }
    }
}
