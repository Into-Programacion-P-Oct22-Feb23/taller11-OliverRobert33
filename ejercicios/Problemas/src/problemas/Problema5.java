/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author OLIVER SARAGURO - RUBEN CONDOY
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        double mensaje = salida(informacion);
        System.out.printf("La suma total del arreglo es: %.2f\n",
                 mensaje);
    }

    public static double salida(int[][] inf) {

        int salida = 0;

        for (int fila = 0; fila < inf.length; fila++) {
            for (int column = 0; column < inf[fila].length; column++) {
                salida = salida + inf[fila][column];
                
            }
        }
        return salida;
    }

}
