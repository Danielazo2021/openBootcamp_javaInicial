public class SmartPhone extends SmartDevice{
    String color;
    Double tamanioPantallaPulgadas;

    public SmartPhone() {
    }

    public SmartPhone(String sistemaOperativo, String nombre, Double duracionBateria) {
        super(sistemaOperativo, nombre, duracionBateria);
    }

    public SmartPhone(String sistemaOperativo, String nombre, Double duracionBateria, String color, Double tamanioPantallaPulgadas) {
        super(sistemaOperativo, nombre, duracionBateria);
        this.color = color;
        this.tamanioPantallaPulgadas = tamanioPantallaPulgadas;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", tamanioPantallaPulgadas=" + tamanioPantallaPulgadas +
                ", SistemaOperativo='" + SistemaOperativo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", DuracionBateria=" + DuracionBateria +
                '}';
    }
}
