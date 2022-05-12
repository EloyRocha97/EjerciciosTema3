package com.Loloy;

public class WhileLoop{

    public static void main(String[] args) {

        //while:tiene unos parentecis en donde se evalua una condicion. Por lo que primero es necesario crearla...


              int count = 0;
        while(count < 10){
            count ++;
            if (count==6){
                continue; // esto salta la condicion
                //break;  // esto detiene el bucle
            }
            System.out.println(count + " Hola mundo");

        }
        System.out.println("fin");
    }
}
