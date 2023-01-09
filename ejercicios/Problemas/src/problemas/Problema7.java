/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author OLIVER SARAGURO - RUBEN CONDOY
 */
public class Problema7 {

    static String[] arreglo1;

    public static void main(String[] args) {
        String salida;
        salida = funcionElementos();
        System.out.printf("\nLas ciudades del ecuador son:\n%s\n",
                salida);

        procedimientoElementos();

    }

    public static String funcionElementos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantos elementos para llenar el Arreglo : ");

        int i = entrada.nextInt();
        String salida = "";
        arreglo1 = new String[i];
        entrada.nextLine();

        for (int f = 0; f < arreglo1.length; f++) {
            String ciudad;
            System.out.println("Ingrese Ciudades del Ecuador: ");
            ciudad = entrada.nextLine();

            arreglo1[f] = ciudad;
        }

        for (int f = 0; f < arreglo1.length; f++) {
            salida = String.format("%s%s ", salida, arreglo1[f]);
        }
        return salida;
    }

    public static void procedimientoElementos() {

        String salida = "";
        for (int j = 0; j < arreglo1.length; j++) {
            if (arreglo1[j].length() >= 4 && arreglo1[j].length() <= 5) {
                salida = String.format("%s%s ", salida, arreglo1[j]);
            }
        }
        System.out.printf("Los elemenos del Arreglo de 4 y 5 caracteres "
                + "son: \n%s\n", salida);
    }
}
