/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
//Scanner entrada = new Scanner(System.in);

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.println("Ingrese 1 si desea el Area de un Cuadrado; 2 si "
                + "si desea el Area de un Triangulo y 3 el Area de un Rectangulo: ");
        op = entrada.nextInt();

        if (op == 1) {
            obtenerAreaCuadrado();
        } else {
            if (op == 2) {
                obtenerAreaTriangulo();
            } else {
                if (op == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("ERROR opcion incorrecta");
                }
            }

        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double op;
        System.out.println("Ingrese la medida de uno de los ladops del Cuadrado: ");
        lado = entrada.nextDouble();
        op = lado * 4;
        System.out.printf("El Area de un Cuadrado es: %.2f\n", op);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double base;
        double op;
        System.out.println("Ingrese la altura del Triangulo: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la base del Triangulo: ");
        base = entrada.nextDouble();
        op = (base * altura) / 2;
        System.out.printf("El Area del Triangulo es: %.2f\n", op);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double altura;
        double base;
        double op;
        System.out.println("Ingrese la altura del Rectangulo: ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese la base del Rectangulo: ");
        base = entrada.nextDouble();
        op = (base * altura);
        System.out.printf("El Area del Rectangulo es: %.2f\n", op);
    }

}
