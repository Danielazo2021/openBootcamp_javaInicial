package com.company;

public class CocheElectrico  extends Coche{
    String motorElectrico="";


    public CocheElectrico() {
        super();

    }
    public CocheElectrico(String motorElectrico) {
        super();
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, Double  peso, Double largo,String motorElectric){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectric;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada= cantidad*2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
