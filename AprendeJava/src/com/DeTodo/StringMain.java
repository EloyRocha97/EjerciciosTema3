package com.DeTodo;

public class StringMain {

    public static void main (String[] args){

        // La clase String

        /*
        lengt()
        StartsWith("")
        endsWith("")
        indexOf("")
        subString(1,5)
        trim()
        equals()
        compareTo
         */

        String mensaje = "Hola mundo";
        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);

        String otro = "HOLA MUNDO";
        if (mensajeMay.equals(otro)){
            System.out.println("Verdadero!");
        }
    }
}
