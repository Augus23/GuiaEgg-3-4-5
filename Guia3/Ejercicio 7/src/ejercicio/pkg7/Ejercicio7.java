/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 este tipo de dispositivo lee cadenas enviadas por el usuario.
 Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 Las secuencias leídas que respeten el formato se consideran correctas,
 la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
 y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
 correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
 cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena;
        int correcta=0,incorrecta=0,largo;
        do {            
            System.out.println("Ingrese una cadena: ");
            cadena=leer.nextLine();
            if(cadena.equals("&&&&&"))
                break;
            if (cadena.length()<=5){
                largo = cadena.length();
                if ((cadena.substring(0,1).equals("X"))&&(cadena.substring(largo-1,largo).equals("O"))) {
                    correcta++;
                } else {
                    incorrecta++;
                }
            } else {
                System.out.println("La cadena tiene mas de 5 caracteres");
                incorrecta++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Correctas: "+ correcta);
        System.out.println("Incorrectas: "+ incorrecta);
    }
}
