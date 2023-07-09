package com.prueba;

import com.prueba.Coche;


import java.util.ArrayList;
import java.util.List;


public class ListMain {
    public static void main(String[] args) {

    List<String> nombres = new ArrayList<String>();

    nombres.add("Juan");
    nombres.add("Pedro");
    nombres.add("Maria");
    nombres.add("Ana");
    nombres.add("Jose");
    nombres.add("Juan");

        System.out.println(nombres);

        for (int i = 0;i< nombres.size();i++)
        {
            System.out.println(nombres.get(i));
        }

        System.out.println("ahora con foreach");
        for (String item : nombres
             ) {
            System.out.println(item);
        }

        List<Coche> coches = new ArrayList<Coche>();
        coches.add(new Coche("Civic"));
        coches.add(new Coche("Mazda"));
        coches.add(new Coche("Lamborgini"));
        coches.add(new Coche("Argo"));
        System.out.println("imprime la lista");

        System.out.println(coches);

        System.out.println("imprime con foreach . name");

        for (Coche c:coches
             ) {
            System.out.println(c.name);
        }
    }
}
