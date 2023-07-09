package poo.ConInterfaces;

import poo.SinInterfces.Empleado;
import poo.SinInterfces.EmpleadoCRUD;

public class Main {

    static IEmpleadoCRUD empleado = new EmpleadoCRUDExcel();
    // no esta desarrollado el codigo, solo es a modo ilustrativo para ver que cmabios
    // habria que hacer si fuera en otro motor, solo cambiamos la linea de arriba
    // despues del new por loq ue corresponda

    public static void main(String[] args) {



        empleado.findAll();
        empleado.save(new Empleado("Hello",34,500000,true));


    }
}
