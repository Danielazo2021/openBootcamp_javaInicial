package poo.clases;

public class Motor {
    String modeloMotor;
    int caballos;
    double parNm;
    int cilindros;

    public Motor(){

    }

    public Motor(String modelo, int caballos, double parNm, int cilindros) {
        this.modeloMotor = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.cilindros = cilindros;
    }

    public void setModelo(String modelo) {
        this.modeloMotor = modelo;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setParNm(double parNm) {
        this.parNm = parNm;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getModelo() {
        return modeloMotor;
    }

    public int getCaballos() {
        return caballos;
    }

    public double getParNm() {
        return parNm;
    }

    public int getCilindros() {
        return cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modeloMotor='" + modeloMotor + '\'' +
                ", caballos=" + caballos +
                ", parNm=" + parNm +
                ", cilindros=" + cilindros +
                '}';
    }
}
