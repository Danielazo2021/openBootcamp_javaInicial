package com.company;

public class CocheHibrido  extends Coche{
    String motorHibrido = "12v + Nafta";

    public CocheHibrido() {

    }
    public CocheHibrido(String color, String fabricante, String modelo, Double  peso, Double largo, String motorHibrido){
        super(color, fabricante, modelo, peso, largo);
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
