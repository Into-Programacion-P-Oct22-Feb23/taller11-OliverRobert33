/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author OLIVER SARAGURO - RUBEN CONDOY
 */
public class Problema7 {

    public static void main(String[] args) {
        String salida;
        salida = funcionElementos();
        System.out.printf("Las ciudades del ecuador son:\n%s\n\n", salida);

        procedimientoElementos();

    }

    public static String funcionElementos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuanto elementos nescecita en el Arreglo 1: ");

        int i = entrada.nextInt();
        String salida = "";
        String[] arreglo1 = new String[i];
        entrada.nextLine();
        
        for (int f = 0; f < arreglo1.length; f++) {
            System.out.println("Ingrese Ciudades del Ecuador: ");
            String ciudad = entrada.nextLine();
            arreglo1[f] = ciudad;
        }

        for (int f = 0; f < arreglo1.length; f++) {
            salida = String.format("%s%s ", salida, arreglo1[f]);
        }
        return salida;
    }

    public static void procedimientoElementos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuanto elementos nescecita en el Arreglo 2: ");
        int i = entrada.nextInt();

        String salida = "";
        String[] arreglo2 = new String[i];
        entrada.nextLine();
        
        for (int j = 0; j < arreglo2.length; j++) {
            System.out.println("Ingrese elementos de tipo cadena para el "
                    + "Arreglo 2: ");
            arreglo2[j] = entrada.nextLine();
        }
        
        for (int j = 0; j < arreglo2.length; j++) {
            if (arreglo2[j].length() >= 4 && arreglo2[j].length() <= 5) {
                salida = String.format("%s%s ", salida, arreglo2[j]);    
            }
        }
        System.out.printf("Los elemenos del Arreglo 2; de 4 y 5 caracteres "
                        + "son: \n%s\n", salida);
    }
}
