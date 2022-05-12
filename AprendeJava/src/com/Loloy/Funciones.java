package com.Loloy;

public class Funciones {

    public static void main  (String[] args){

        
//        holaMundo();
//        holaMundo("Goku");
//        holaMundo("Vegeta");
//       String hola = devolverHola();
//               System.out.println(hola);

                int num1 =2;
                int num2 = 5;
             int resultado =sum(num1 , num2);     //donde G = guardo (muestre)
        System.out.println(resultado);              //llamo a lo que me muestre
    }


    static void holaMundo() {
        System.out.println("Goku le gana");
    }

    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static void holaMundo(String name, String surname){
        System.out.println("Hola " + name + " " + surname);
    }
    public static String devolverHola(){
        return "Hola chicos";
    }

    private static int sum ( int num1, int num2){
        return (num1 + num2);
    }
}
