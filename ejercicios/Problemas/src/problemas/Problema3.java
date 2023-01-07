/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
//import java.util.Scanner;
//Scanner entrada = new Scanner(System.in);

/**
 *
 * @author OLIVER SARAGURO - RUBEN CONDOY
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String salida;
        System.out.println("Ingrese nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese nota 4: ");
        nota4 = entrada.nextDouble();

        salida = obtenerpromedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.2f %.2f %.2f %.2f %s\n"
                ,nota1
                ,nota2
                ,nota3
                ,nota4
                ,salida);
    }

    public static String obtenerpromedioCualitativo(double n1, double n2, double n3,
            double n4) {
        double suma;
        double op;
        String proC = "";
        //  String salida;
        suma = n1 + n2 + n3 + n4;
        op = suma / 4;
        if (op >= 0 && op <= 5) {
            proC = "es Regular";
        } else if (op > 5 && op <= 9) {
            proC = "es Bueno";
        } else if (op > 9 && op <= 10) {
            proC = "es Sobresaliente";
        }
        return proC;
    }

}
