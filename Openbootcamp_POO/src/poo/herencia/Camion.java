package poo.herencia;
import poo.clases.Vehiculo;

public class Camion extends Vehiculo{

    double capacidadCarga;

    public Camion(String fabricante, String modelo, double capacidadCarga) {
        super(fabricante, modelo);
        this.capacidadCarga = capacidadCarga;
    }


}
