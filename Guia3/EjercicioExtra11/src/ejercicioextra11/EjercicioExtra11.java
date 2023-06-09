/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos
 que componen ese número. Por ejemplo, si introducimos el número 12345,
 el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
 utilizando el operador de división. Nota: recordar que las variables de tipo
 entero truncan los números o resultados.
 */
package ejercicioextra11;

import java.util.Scanner;

/**
 *
 * @author userç
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int contador=0;
        System.out.println("Ingrese un numero y te devolveremos la cantidad de sus digitos: ");
        int numero=leer.nextInt();
        do {            
            numero/=10;
            contador++;
        } while (numero>0);
        System.out.println("La cantidad de digitos es: "+contador);
    }   
}
