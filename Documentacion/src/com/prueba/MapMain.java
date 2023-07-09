package com.prueba;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Coche> persona= new HashMap<>();
        persona.put("Joshe", new Coche("lamborgini"));
        persona.put("Pepe", new Coche("Porche"));
        persona.put("Malon", new Coche("Mazda"));
        persona.put("Mara", new Coche("Argo"));

        System.out.println(persona);

        for(String key: persona.keySet()){
            System.out.println(key);
        }
        for(Coche value: persona.values()){
            System.out.println(value.name);
        }

        for( Map.Entry<String, Coche> pair: persona.entrySet()){ // usamos este para imprimir clave valor juntos
            System.out.println(pair.getKey() + " tiene un " + pair.getValue());
        }




    }
}
