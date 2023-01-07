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
public class Problema6 {

    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        System.out.printf("La media aritmetica del arreglo es: %.2f\n"
                ,obtenerPromedio(informacion));

        System.out.printf("La desviacion estándar de los valores del "
                + "arreglo es: %.2f\n"
                , obtenerDesviacion(informacion,
                obtenerPromedio(informacion)));
    }

    public static double obtenerPromedio(int[] a) {

        double promedio;
        int resultado = 0;

        for (int fila = 0; fila < a.length; fila++) {
            resultado = resultado + a[fila];
        }

        promedio = (resultado / a.length);

        return promedio;

    }

    public static double obtenerDesviacion(int[] a, double b) {

        double numero = 0;
        int resultado = 0;
        double desviacion;

        for (int fila = 0; fila < a.length; fila++) {

            double x = a[fila] - b;
            double y = Math.pow(x, 2);
            numero = numero + Math.pow(a[fila] - b, 2);
            resultado = resultado + a[fila];

        }

        desviacion = Math.sqrt(numero / a.length);
        return desviacion;
    }

}
