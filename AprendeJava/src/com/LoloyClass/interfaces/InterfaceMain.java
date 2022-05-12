package com.LoloyClass.interfaces;

import com.LoloyClass.ObjClass.Coche;

public class InterfaceMain {

    public static void main(String[] args) {

                CocheService service1= new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemos();







    }

}
