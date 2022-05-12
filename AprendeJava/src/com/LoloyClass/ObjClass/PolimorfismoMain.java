package com.LoloyClass.ObjClass;

import com.LoloyClass.ObjClass.Coche;
import com.LoloyClass.ObjClass.CocheElectrico;
import com.LoloyClass.ObjClass.CocheHibrido;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 =new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //polimorismo

        Coche coche4 = new CocheElectrico();      // tipo padre = new tipo hijo

        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche) {
            System.out.println("coche");
        }

        if (coche4 instanceof CocheElectrico){             // si un objeto es instancia de una clase
            System.out.println("auto electrico");       // objeto (coche4), instancia de (ElectricCar)
        }

        if (coche4 instanceof CocheHibrido){
            System.out.println("auto hibrido");
        }



    }

}
