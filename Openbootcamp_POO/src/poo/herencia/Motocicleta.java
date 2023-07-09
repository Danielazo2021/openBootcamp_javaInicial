package poo.herencia;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo{
    boolean baul;
    public Motocicleta(String fabricante, String modelo,  boolean baul) {
        super(fabricante, modelo);
        this.baul = baul;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "baul=" + baul +
                ", fabricante='" + fabricante + '\'' +
                ", modeloVehiculo='" + modeloVehiculo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sport=" + sport +
                ", speed=" + speed +
                '}';
    }
}
