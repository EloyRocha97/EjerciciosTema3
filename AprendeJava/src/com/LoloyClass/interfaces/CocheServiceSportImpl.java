package com.LoloyClass.interfaces;

import com.LoloyClass.ObjClass.Coche;
import com.LoloyClass.ObjClass.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemos() {
        System.out.println("creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
