package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {
        Coche coche1=new CocheElectrico("azul","fiat","Argo",1520.2,5.3,"");
        Coche coche2=new CocheElectrico("azul","fiat","Argo",1520.2,5.3,"machin turbo");
        Coche coche3=new CocheHibrido("azul","fiat","Argo",1520.2,5.3,"machin turbo");

        System.out.println( coche1.toString());
        System.out.println( coche2.toString());
        System.out.println( coche3.toString());

        if (coche2 instanceof CocheHibrido){
            System.out.println("es un coche Hibrido");
        }else{
            System.out.println("no es un coche Hibrido");
            if (coche2 instanceof CocheElectrico){
                System.out.println("es un coche Electrico");
            }else{
                System.out.println("no es un coche Electrico");
            }

        }

    }
}
