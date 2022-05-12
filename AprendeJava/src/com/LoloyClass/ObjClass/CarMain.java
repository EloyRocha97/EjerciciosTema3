package com.LoloyClass.ObjClass;

public class CarMain {

    public static void main(String[] args) {


        String auto = "simbol";          // tipo de dato string, identificador = "valor asignado"

        Coche autoObj = new CocheHibrido();
        Coche autoObj2 = new CocheElectrico("gris",  "reno",  "simbol", 1450.45,  5.4,
                "motor");
        autoObj2.acelerar(50);
        System.out.println(autoObj2);
        autoObj2.peso = 1500.5;
        System.out.println(autoObj2);


        CocheElectrico electricCar =new CocheElectrico(); //instanciar lo q cree en Electri...
        electricCar.motorElectrico="Ejemplo motor";
        electricCar.color="Ej. color";
        electricCar.fabricante="Toyota";
        electricCar.modelo="xxx";
        electricCar.acelerar(50);
        System.out.println(electricCar);

        CocheElectrico electricCar2 =new CocheElectrico("rojo","Alfa","Romeo",1500d,4.99,
                "TXZ");
        System.out.println(electricCar2);

        electricCar2.acelerar(60);
        System.out.println(electricCar2);

    }
}
