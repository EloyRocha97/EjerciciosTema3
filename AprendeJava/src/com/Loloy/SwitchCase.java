package com.Loloy;

public class SwitchCase {

    public static void main(String[] args) {

        String weather= "cloudy";  // case significa "casos", "cloudy" seria el caso buscado en este momento.
        switch (weather){          // esto se usa para evaluar dif. condiciones.

            case "sunny":
                System.out.println("El tiempo es soleado");
                break;  // si no ponemos el break, sigue ejecutando la siguiente
            case "cloudy":
                System.out.println("El tiempo esta nublado");
                break;
            default:
                System.out.println("No se ha encontrado el clima");
                break;
        }
    }
}
