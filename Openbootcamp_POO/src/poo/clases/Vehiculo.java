package poo.clases;

public class Vehiculo {
     protected String fabricante;
    protected String modeloVehiculo;
    protected  Double cc;
    protected  int year;
    protected String color;
    protected boolean sport;
    protected int speed=0;

    Motor motor;

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modeloVehiculo;
    }

    public Double getCc() {
        return cc;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public boolean isSport() {
        return sport;
    }

    public int getSpeed() {
        return speed;
    }

    // constructores
    public Vehiculo() {

    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modeloVehiculo = modelo;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehiculo(String fabricante, String modeloVehiculo, Double cc, int year, String color, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modeloMotor, Double cc, int year, String color, boolean sport, int speed) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.year = year;
        this.color = color;
        this.sport = sport;
        this.speed = speed;
        this.motor= new Motor();
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
        this.motor = new Motor();
    }

    //metodos
    public void acelerar(int cantidad){
        if(this.speed+cantidad<120 && this.speed+cantidad>0)
        this.speed +=cantidad;
        else{
            System.out.println("El vehiculo no puede acelerar esa cantidad");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modeloVehiculo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sport=" + sport +
                ", speed=" + speed +
                ", motor=" + motor +
                '}';
    }
}
