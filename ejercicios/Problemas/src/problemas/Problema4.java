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
 * @author OLIVER SARAGURO
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre y apellido: ");
        String name = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = entrada.nextInt();
        
        System.out.println("Ingrese 1 si desea calcular el Valor de la Planilla "
                + "de Luz y\n2 si desea calcular el predio del inmueble: ");
        int op = entrada.nextInt();
        if (op == 1) {
            calcularValorLuz(name, cedula);
        } else {
            if (op == 2) {
                calcularPredio(name, cedula);
            } else {
                System.out.println("ERROR opcion no encontrada.");
            }
        }
    }
    
    public static void calcularValorLuz(String n, int c) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el costo del Kilowatio: ");
        double costoK = entrada.nextDouble();
        System.out.println("Ingrese los Kilowatios consumidos en el mes: ");
        double consumidosK = entrada.nextDouble();
        
        double op = costoK * consumidosK;
        System.out.printf("Cliente %s con cedula %d debe cancelar el valor"
                + "de $%.2f\n "
                ,n 
                ,c
                , op);
    }
    
    public static void calcularPredio(String n, int c) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el costo del Inmueble: ");
        double costoI = entrada.nextDouble();
        
        double op = (costoI * 2) / 100;
        System.out.printf("Cliente %s con cedula %d tiene un bien inmueble "
                + "valorado en $%.1f  y tiene que pagar de predio $%.1f\n "
                ,n 
                ,c
                , costoI
                , op);
        
    }

}
