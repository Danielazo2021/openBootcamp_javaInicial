package com.company;

public class CocheMain {
    public static void main(String[] args) {
        Coche coche = new CocheElectrico("rojo","toyota","corolla",650.0,3.5,"");
        System.out.println(coche.toString());
        coche.acelerar(80);
        System.out.println(coche);

        CocheElectrico CocheE1= new CocheElectrico("electric");
        System.out.println(CocheE1);

        CocheHibrido cHibrido= new CocheHibrido();
        cHibrido.acelerar(112);
        System.out.println(cHibrido);

        CocheElectrico CE2= new CocheElectrico("azul","fiat","Argo",1520.2,5.3,"machin turbo");
        CE2.acelerar(55);
        System.out.println(CE2);
    }
}
