public class SmartWatch extends SmartDevice{
    String colorMalla;
    Boolean isMallaCuero;

    public SmartWatch() {
    }

    public SmartWatch(String sistemaOperativo, String nombre, Double duracionBateria) {
        super(sistemaOperativo, nombre, duracionBateria);
    }

    public SmartWatch(String sistemaOperativo, String nombre, Double duracionBateria, String colorMalla, Boolean isMallaCuero) {
        super(sistemaOperativo, nombre, duracionBateria);
        this.colorMalla = colorMalla;
        this.isMallaCuero = isMallaCuero;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colorMalla='" + colorMalla + '\'' +
                ", isMallaCuero=" + isMallaCuero +
                ", SistemaOperativo='" + SistemaOperativo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", DuracionBateria=" + DuracionBateria +
                '}';
    }
}
