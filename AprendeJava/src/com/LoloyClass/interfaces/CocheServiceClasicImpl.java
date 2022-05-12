package com.LoloyClass.interfaces;

import com.LoloyClass.ObjClass.Coche;
import com.LoloyClass.ObjClass.CocheElectrico;

public class CocheServiceClasicImpl implements CocheService {
    @Override
    public Coche crearCocheDemos() {
        System.out.println("creando coche classic");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("destruyendo coche");
    }
}
