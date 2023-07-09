package com.Interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceSportImp implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        return new CocheElectrico();
    }
    public void destruirCoche(Coche coche){
        System.out.println("Coche:"+coche+" Destruido");
    }
}
