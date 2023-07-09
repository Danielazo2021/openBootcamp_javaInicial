package poo.herencia;
import poo.clases.Vehiculo;

public class Coche extends Vehiculo{

    int numPuertas;

    public Coche(String fabricante, String modelo, int numPuertas) {
        super(fabricante, modelo);
        this.numPuertas = numPuertas;
    }

}
