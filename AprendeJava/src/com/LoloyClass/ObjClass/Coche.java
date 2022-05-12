package com.LoloyClass.ObjClass;

public class Coche {

    // atributos: sus caracteristicas.
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores: metodos especiales que nos van a permitir crear objetos de esta clase.
    public Coche(){

    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
            }

    //comportamiento, metodos

    public void acelerar(Integer cantidad){
        if(cantidad>0&& cantidad<=120) {
            this.velocidad += cantidad;
        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
