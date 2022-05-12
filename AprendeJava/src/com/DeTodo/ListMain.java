package com.DeTodo;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");

        System.out.println(nombres);

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("puto"));
        coches.add(new Coche("el que"));
        coches.add(new Coche("lee"));

        System.out.println(coches);

        for (Coche coche : coches){
            System.out.println(coche);
        }
    }
}
