package poo.SinInterfces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> listaEmpleados = new ArrayList<Empleado>();


public void Crear(Empleado empleado){
listaEmpleados.add(empleado);

}

public List Read(){
    return listaEmpleados;
}




public Empleado Read(String nombre){
    for (Empleado empleado : listaEmpleados) {
        if (empleado.getNombre().equals(nombre)) {
            return empleado;
        }
    }
    return null;
}



    @Override
    public String toString() {
        return "EmpleadoCRUD{" +
                "listaEmpleados=" + listaEmpleados +
                '}';
    }
}
