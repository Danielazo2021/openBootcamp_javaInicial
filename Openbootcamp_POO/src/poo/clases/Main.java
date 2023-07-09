package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setFabricante("Ford");
        coche.setModelo("Mustang");
        coche.setColor("Blanco");
        System.out.println(coche);

        Motor motorGti= new Motor("Gti",250,499,6);


        Vehiculo coche2 = new Vehiculo("Ford", "Mondeo", 2.1, 2017, "Rojo", true,0, motorGti);
        System.out.println(coche2);

        coche2.acelerar(100);
        System.out.println(coche2);

        coche2.acelerar(-110);
        System.out.println(coche2);


        Motocicleta miMoto= new Motocicleta("Yamaha","Ybr 125", false);
        miMoto.color= "Azul";

        System.out.println(miMoto);

        //         3. polimorfismo , varios objetos diferentes interpretan el mismo mensaje pero reacionan de forma diferente
        // ejmplo moto, camion, coche, todos tienen un metodo acelerar y son todos vehiculo(heredan de ahi)
        Vehiculo vehiculo;
        vehiculo = new Motocicleta("","",true);
        vehiculo.acelerar(50);

        vehiculo = new Coche("","",5);
        vehiculo.acelerar(50);

        vehiculo = new Camion("","",1000);
        vehiculo.acelerar(50);

        //4. clases abstractas, no se pueden instanciar, solo se instancian las clases hijas
        // por ejemplo la clase persona, de ella dderiva maestro y alumno, persona podria ser abstracta para que en
        // un curso no haya una clase persona, pero si un maestro o un alumno

        //5. modificador static nos permite indicar que un atributo o metodo pertenece a una plantilla, no podemos instanciar, pero podemos unas el metodo sin instanciar
        //ejemplo la clase math ujnamos squartz ( o algo asi) llamamos al metodo estatico de la clase sin instanciar a ningun ojjeto de la clase math

        //programacion generica

    }
}
