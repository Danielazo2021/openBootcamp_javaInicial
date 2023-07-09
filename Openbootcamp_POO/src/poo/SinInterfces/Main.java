package poo.SinInterfces;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleado = new EmpleadoCRUD();

    Empleado empleado1= new Empleado("Pedro", 35,40000, true);

        Empleado empleado2= new Empleado("Juen", 22,205500, true);
        Empleado empleado3= new Empleado("Carlos", 37,90000, true);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        empleado.Crear(empleado1);
        empleado.Crear(empleado2);
            empleado.Crear(empleado3);

        System.out.println(empleado.listaEmpleados);

        if(empleado.Read("Juen")!=null){
            System.out.println("El empleado consultado es: "+ empleado.Read("Juen"));
        }else{
            System.out.println("No existe ese empleado, verifique el nombre");
        }


        if(empleado.Read("Peter")!=null){
            System.out.println("El empleado consultado es: "+empleado.Read("Peter"));
        }else{
            System.out.println("No existe ese empleado, verifique el nombre");
        }

    }
}
