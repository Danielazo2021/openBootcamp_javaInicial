package com.Interfaces;

import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service= new CocheServiceClassicImp();
        CocheService service2= new CocheServiceSportImp();

        Coche coche1= service.crearCocheDemo();
        coche1.acelerar(34);
        System.out.println(coche1.toString());



    }
}
