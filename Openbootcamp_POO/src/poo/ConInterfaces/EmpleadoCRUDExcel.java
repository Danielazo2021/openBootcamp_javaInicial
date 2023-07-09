package poo.ConInterfaces;

import poo.SinInterfces.Empleado;

import java.util.List;

public class EmpleadoCRUDExcel implements IEmpleadoCRUD, EmpleadoReader{ // se pueden poner varias interfaces,poner mas metodos ,
    // pero minimo los que tiene la interfaz mensionada
    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
