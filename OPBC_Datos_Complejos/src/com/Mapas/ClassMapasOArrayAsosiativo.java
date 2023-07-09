package com.Mapas;

import java.util.HashMap;
import java.util.Map;

public class ClassMapasOArrayAsosiativo {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();


        map.put("Clave1", 10);
        map.put("Clave2", 20);
        map.put("Clave3", 30);
        map.put("Clave4", 40);

        System.out.println(map.get("Clave2"));
        map.replace("Clave2",150);
        System.out.println(map.get("Clave2"));
        map.remove("Clave3");

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
