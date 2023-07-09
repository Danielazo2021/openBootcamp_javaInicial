package poo.ConInterfaces;

import poo.SinInterfces.Empleado;

import java.util.List;


/**
 * Se declaran los metodos pero no se implementan, eso va en las clases que implementen la interfaz, alli se desarrollan
 */
public interface IEmpleadoCRUD {
     void save(Empleado empleado);

     List<Empleado> findAll();

    void delete(Empleado empleado);

}
